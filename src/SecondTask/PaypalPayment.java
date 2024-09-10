package SecondTask;

public class PaypalPayment implements Payment {

    @Override
    public void pay(float amount) {
        System.out.println("Payment with Paypal: " + amount);
    }
}
