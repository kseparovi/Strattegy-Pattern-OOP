package SecondTask;

public class BitcoinPaymentStrategy implements PaymentStrategy {


    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje Bitcoinom. Iznos: " + amount + " HRK.");
    }
}
