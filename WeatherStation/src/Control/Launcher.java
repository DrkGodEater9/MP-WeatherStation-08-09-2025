package control;

import Observer.DisplayActualData;
import Observer.DisplayIndex;
import Subject.WeatherStation;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("=== WEATHER STATION OBSERVER PATTERN DEMO ===\n");
        
        // create weather station
        WeatherStation weatherStation = new WeatherStation();
        
        // create displays
        DisplayActualData currentDisplay = new DisplayActualData(weatherStation);
        DisplayIndex heatIndexDisplay = new DisplayIndex(weatherStation);
        
        System.out.println("--- First Lecture ---");
        weatherStation.setMeasurements(65.0f, 25.5f, 1013.25f);
        
        System.out.println("--- Second Lecture ---");
        weatherStation.setMeasurements(70.0f, 28.0f, 1010.15f);
        
        System.out.println("--- Third Lecture ---");
        weatherStation.setMeasurements(80.0f, 32.0f, 1008.75f);
        
        System.out.println("--- Remove Display ---");
        weatherStation.removeObserver(currentDisplay);
        
        System.out.println("--- Fourth lecture (only Heat Index) ---");
        weatherStation.setMeasurements(75.0f, 29.5f, 1012.50f);
        
        System.out.println("=== FINAL ===");
    }
}