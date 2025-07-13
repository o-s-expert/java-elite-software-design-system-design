package expert.os.examples.payment;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaymentService {
    public void process(String paymentDetails) {
        System.out.println("Processing payment: " + paymentDetails);
    }
}
