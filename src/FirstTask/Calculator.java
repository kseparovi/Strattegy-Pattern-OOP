package FirstTask;



public class Calculator {
    private CalculationStrategy strategy;

    // Postavljanje strategije
    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    // Metoda za izvršavanje operacije
    public float performCalculation(float num1, float num2) {
        return strategy.calculation(num1, num2);
    }

    // Metoda za prikaz rezultata
    public void display(float result) {
        System.out.println("Rezultat: " + result);
    }
}
