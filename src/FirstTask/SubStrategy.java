package FirstTask;

public class SubStrategy implements CalculationStrategy {

    public SubStrategy() {
    }


    @Override
    public float calculation(float a, float b) {
        System.out.println(a - b);
        return a;
    }
}
