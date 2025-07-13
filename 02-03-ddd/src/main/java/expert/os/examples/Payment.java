package expert.os.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD,
        java.lang.annotation.ElementType.PARAMETER,
        java.lang.annotation.ElementType.TYPE,
        java.lang.annotation.ElementType.METHOD})
public @interface Payment {

    PaymentType value() default PaymentType.CREDIT_CARD;
}


