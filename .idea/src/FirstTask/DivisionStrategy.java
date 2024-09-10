package FirstTask;

public class DivisionStrategy implements CalculationStrategy {


    int num1;
    int num2;


    public DivisionStrategy(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }






    @Override
    public void calculation(float a, float b) {
        System.out.println(a / b);

    }
}
