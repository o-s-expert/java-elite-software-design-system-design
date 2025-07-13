package expert.os.examples;

import jakarta.enterprise.util.AnnotationLiteral;

public class PaymentFilter extends AnnotationLiteral<Payment> implements Payment {

    private final PaymentType type;

    private PaymentFilter(PaymentType type) {
        this.type = type;
    }

    @Override
    public PaymentType value() {
        return type;
    }

    public static PaymentFilter of(PaymentType type) {
        return new PaymentFilter(type);
    }
}
