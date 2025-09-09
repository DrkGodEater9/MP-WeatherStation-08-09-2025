package Subject;

import Observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();
    private float humidity;
    private float temperature; 
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(humidity, temperature, pressure);
        }
    }
    
    public void setMeasurements(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    public void measurementsChanged() {
        notifyObserver();
    }
    
    public float getHumidity() { return humidity; }
    public float getTemperature() { return temperature; }
    public float getPressure() { return pressure; }
}