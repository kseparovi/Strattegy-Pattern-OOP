package FirstTask;

public class SimpleCalculator extends Calculator {


    @Override
    public float performCalculation(float num1, float num2) {
        System.out.println("SimpleCalculator se koristi");
        return super.performCalculation(num1, num2);
    }
}

