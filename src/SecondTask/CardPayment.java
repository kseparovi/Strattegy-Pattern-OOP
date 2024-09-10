package SecondTask;

public class CardPayment implements Payment {


    @Override
    public void pay(float amount) {
        System.out.println("Payment with card: " + amount);
    }
}
