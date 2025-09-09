package Subject;

import Observer.Observer;


/**
 *
 * @author Estudiantes
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
