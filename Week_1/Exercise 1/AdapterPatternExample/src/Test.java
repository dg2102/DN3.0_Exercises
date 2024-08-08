public class Test {
    public static void main(String[] args) {
        PaymentProcessor paytmProcessor = new Paytmadapter();
        paytmProcessor.processPayment(100);

        PaymentProcessor gPaymentProcessor = new GpayAdapter();
        gPaymentProcessor.processPayment(200);
    }
}
