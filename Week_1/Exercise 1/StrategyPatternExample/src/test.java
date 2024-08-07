public class test {
    public static void main(String[] args) {
        // Payment using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9124-3456");
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(100);

        // Payment using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(200);
    }
}