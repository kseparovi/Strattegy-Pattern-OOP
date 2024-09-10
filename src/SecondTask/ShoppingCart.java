package SecondTask;

public class ShoppingCart {
    private Payment paymentStrategy;

    // Metoda za postavljanje strategije plaćanja
    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Metoda za plaćanje
    public void pay(float amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Strategija plaćanja nije postavljena!");
        }
        paymentStrategy.pay((float) amount);
    }

    public void setPayment(CardPayment cardPayment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
