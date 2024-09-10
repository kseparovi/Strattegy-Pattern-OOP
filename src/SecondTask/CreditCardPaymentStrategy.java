package SecondTask;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje karticom. Iznos: " + amount + " HRK.");
    }
}
