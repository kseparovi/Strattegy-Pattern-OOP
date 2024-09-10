package SecondTask;

public class BitcoingPayment implements Payment {

    @Override
    public void pay(float amount) {
        System.out.println("Payment with Bitcoin: " + amount);
    }
}
