package SecondTask;

public class PouzecePayment implements Payment {

    @Override
    public void pay(float amount) {
        System.out.println("Pouzece payment: " + amount);
    }
}
