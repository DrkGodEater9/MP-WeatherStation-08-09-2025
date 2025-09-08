package Subject;

import Observer.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiantes
 */
public class WeatherStation implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        
    }

    @Override
    public void removeObserver(Observer observer) {
        
    }

    @Override
    public void notifyObserver() {
        
    }
    
}
