package Observer;

/**
 *
 * @author Estudiantes
 */
public class DisplayIndex implements Observer, DisplayElement{

    private float HI;
    private float[] dataS;
    @Override
    public void update(float humidity, float temperature, float pressure) {
        calculateHI(humidity, temperature, pressure);
    }

    @Override
    public void display() {
        System.out.println("Heat Index: "+this.HI);
    }
    
    public void calculateHI(float humidity, float temperature, float pressure){
        
        
    }
    
}
