package FirstTask;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Unesite prvi broj: ");
            float num1 = scanner.nextFloat();

            System.out.println("Unesite drugi broj: ");
            float num2 = scanner.nextFloat();

            System.out.println("Odaberite operaciju (+, -, *, /) ili 'exit' za izlaz:");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            switch (operation) {
                case "+":
                    calculator.setStrategy(new AddStrategy());
                    break;
                case "-":
                    calculator.setStrategy(new SubStrategy());
                    break;
                case "*":
                    calculator.setStrategy(new MultiplyStrategy());
                    break;
                case "/":
                    calculator.setStrategy(new DivisionStrategy());
                    break;
                default:
                    System.out.println("Nepoznata operacija!");
                    continue;
            }

            // Izvršavanje i prikaz rezultata
            try {
                float result = calculator.performCalculation(num1, num2);
                calculator.display(result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
