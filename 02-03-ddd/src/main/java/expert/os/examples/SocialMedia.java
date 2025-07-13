package expert.os.examples;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class SocialMedia {

    public void printNews(@Observes News news) {
        System.out.println("Social Media: " + news.get());
    }
}
