package SecondTask;

public class CashOnDeliveryPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje pouzećem. Iznos: " + amount + " HRK.");
    }
}
