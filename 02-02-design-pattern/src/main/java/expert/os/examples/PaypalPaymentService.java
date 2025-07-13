package expert.os.examples;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Qualifier;

@ApplicationScoped
@Payment(PaymentType.PAYPAL)
public class PaypalPaymentService implements PaymentService {
    @Override
    public String processPayment(String paymentDetails) {
        return "Paypal payment processed for: " + paymentDetails;
    }
}
