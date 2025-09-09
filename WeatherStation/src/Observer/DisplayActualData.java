package Observer;

import Subject.Subject;

public class DisplayActualData implements Observer, DisplayElement{
    private float humidity, temperature, pressure;
    private Subject weatherStation;

    public DisplayActualData(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("=== Current Weather Conditions ===");
        System.out.println("Temperature: " + String.format("%.1f", this.temperature) + "°C");
        System.out.println("Humidity: " + String.format("%.1f", this.humidity) + "%");
        System.out.println("Pressure: " + String.format("%.2f", this.pressure) + " hPa");
        System.out.println();
    }
}