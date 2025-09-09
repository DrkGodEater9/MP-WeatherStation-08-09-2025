package Observer;

import Subject.WeatherStation;

public class DisplayIndex implements Observer, DisplayElement{
    private float HI; // Heat Index
    private WeatherStation weatherStation;
    
    private static final double C1 = -8.78469475556;
    private static final double C2 = 1.61139411;
    private static final double C3 = 2.33854883889;
    private static final double C4 = -0.14611605;
    private static final double C5 = -0.012308094;
    private static final double C6 = -0.0164248277778;
    private static final double C7 = 2.211732e-3;
    private static final double C8 = 7.2546e-4;
    private static final double C9 = -3.582e-6;

    public DisplayIndex(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float humidity, float temperature, float pressure) {
        calculateHI(humidity, temperature, pressure);
        display();
    }

    @Override
    public void display() {
        System.out.println("=== Heat Index Display ===");
        System.out.println("Heat Index: " + String.format("%.2f", this.HI) + "°C");
        
        if (this.HI < 27) {
            System.out.println("Precaution: Normal activity, but stay hydrated");
        } else if (this.HI < 32) {
            System.out.println("Extreme Caution: Fatigue possible with prolonged exposure");
        } else if (this.HI < 41) {
            System.out.println("Danger: Heat exhaustion and heat cramps likely");
        } else {
            System.out.println("Extreme Danger: Heat stroke imminent");
        }
        System.out.println();
    }
    
    public void calculateHI(float humidity, float temperature, float pressure) {
        double T = temperature;
        double R = humidity;
        
        // HI = c1 + c2*T + c3*R + c4*T*R + c5*T² + c6*R² + c7*T²*R + c8*T*R² + c9*T²*R²
        this.HI = (float) (C1 + 
                          C2 * T + 
                          C3 * R + 
                          C4 * T * R + 
                          C5 * T * T + 
                          C6 * R * R + 
                          C7 * T * T * R + 
                          C8 * T * R * R + 
                          C9 * T * T * R * R);
    }
}