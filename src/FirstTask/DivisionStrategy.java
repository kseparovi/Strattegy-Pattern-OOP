package FirstTask;

public class DivisionStrategy implements CalculationStrategy{

    public DivisionStrategy() {
    }


    @Override
    public float calculation(float a, float b) {
        System.out.println("Division: " + (a / b));

        return a;
    }
}
