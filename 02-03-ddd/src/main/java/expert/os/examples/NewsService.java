package expert.os.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

@ApplicationScoped
public class NewsService {


   private final Event<News> newsEvent;

   @Inject
    public NewsService(Event<News> newsEvent) {
        this.newsEvent = newsEvent;
    }

    public void publish(News news) {
       newsEvent.fire(news);
    }
}
