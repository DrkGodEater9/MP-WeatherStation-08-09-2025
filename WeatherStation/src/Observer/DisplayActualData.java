package Observer;

/**
 *
 * @author Estudiantes
 */
public class DisplayActualData implements Observer, DisplayElement{

    private float humidity, temperature, pressure;
    @Override
    public void update(float humidity, float temperature, float pressure) {
        this.humidity=humidity;
        this.temperature=temperature;
        this.pressure=pressure;
    }

    @Override
    public void display() {
        System.out.println("Humidity: "+ this.humidity + "\n Temperature: " + this.temperature + "\n Pressure: " + this.pressure);
    }
    
}