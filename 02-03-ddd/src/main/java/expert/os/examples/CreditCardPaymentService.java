package expert.os.examples;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
@Payment(PaymentType.CREDIT_CARD)
@Default
public class CreditCardPaymentService implements PaymentService {
    @Override
    public String processPayment(String paymentDetails) {
        return "Credit Card payment processed for: " + paymentDetails;
    }
}
