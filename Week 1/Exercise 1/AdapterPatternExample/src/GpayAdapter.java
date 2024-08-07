public class GpayAdapter implements PaymentProcessor {
    private Gpay gpay;

    public GpayAdapter(){
        this.gpay=new Gpay();
    }
    @Override
    public void processPayment(double amount) {
        gpay.charge(amount);
    }
}