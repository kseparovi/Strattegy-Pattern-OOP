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
                cart.setPayment(new CardPayment());
                break;
            case 2:
                cart.setPayment(new CashPayment());
                break;
            case 3:
                cart.setPayment(new PaypalPayment());
                break;
            case 4:
                cart.setPayment(new BitcoingPayment());
                break;
            default:
                System.out.println("Nepoznata opcija!");
                break;
        }
