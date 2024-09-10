package SecondTask;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite iznos za plaćanje:");
        double amount = scanner.nextDouble();

        System.out.println("Odaberite način plaćanja: (1) Kartica, (2) Pouzećem, (3) PayPal, (4) Bitcoin");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                cart.setPaymentStrategy(new CreditCardPaymentStrategy());
                break;
            case 2:
                cart.setPaymentStrategy(new CashOnDeliveryPaymentStrategy());
                break;
            case 3:
                cart.setPaymentStrategy(new PayPalPaymentStrategy());
                break;
            case 4:
                cart.setPaymentStrategy(new BitcoinPaymentStrategy());
                break;
            default:
                System.out.println("Neispravan izbor!");
                scanner.close();
                return;
        }

        // Izvršavanje plaćanja
        cart.pay(amount);

        scanner.close();
    }
}
