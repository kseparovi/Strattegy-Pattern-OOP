package SecondTask;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Metoda za postavljanje strategije plaćanja
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Metoda za plaćanje
    public void pay(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Strategija plaćanja nije postavljena!");
        }
        paymentStrategy.pay(amount);
    }
}
