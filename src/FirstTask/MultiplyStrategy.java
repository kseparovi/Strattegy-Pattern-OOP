package FirstTask;

public class MultiplyStrategy implements CalculationStrategy {

    public MultiplyStrategy() {

    }


    @Override
    public float calculation(float a, float b) {
        System.out.println("Multiplication: " + (a * b));

        return a;
    }
}
