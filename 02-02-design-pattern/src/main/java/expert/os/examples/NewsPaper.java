package expert.os.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class NewsPaper {

    public void printNews(@Observes News news) {
        System.out.println("Printing News Paper: " + news.get());
    }
}
