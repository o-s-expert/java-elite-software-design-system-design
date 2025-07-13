package expert.os.examples;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App {

    public static void main(String[] args) {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            PaymentService paymentService = container.select(PaymentService.class, PaymentFilter.of(PaymentType.CREDIT_CARD))
                    .get();
            String processed = paymentService.processPayment("Order #12345");

            System.out.println("Processed Payment: " + processed);

            News news = new News("CDI in action", "Breaking News: CDI in Action!");

            NewsService newsService = container.select(NewsService.class).get();
            newsService.publish(news);

            Worker worker = container.select(Worker.class).get();
            String crudOperation = worker.task("CRUD Operation");
            System.out.println("Worker Task Result: " + crudOperation);

        }
    }
}