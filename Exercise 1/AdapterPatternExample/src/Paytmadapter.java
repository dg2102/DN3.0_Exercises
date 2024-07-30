public class Paytmadapter implements PaymentProcessor {
    private paytm paytm;

    public Paytmadapter() {
        this.paytm = new paytm();
    }

    @Override
    public void processPayment(double amount) {
        paytm.makePayment(amount);
    }
}
