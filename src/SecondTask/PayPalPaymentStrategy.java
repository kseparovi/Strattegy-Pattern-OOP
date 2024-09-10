package SecondTask;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje PayPalom. Iznos: " + amount + " HRK.");
    }
}
