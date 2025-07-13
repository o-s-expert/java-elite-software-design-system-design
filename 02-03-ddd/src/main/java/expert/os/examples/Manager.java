package expert.os.examples;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.inject.Inject;

@Decorator
@Priority(50)
public class Manager implements Worker {

    @Inject
    @Delegate
    @Any
    private Worker worker;

    @Override
    public String task(String task) {
        return "Sending an email to the boss about: " + task + "\n" +
               worker.task(task) + "\n" +
                "And now I will take a coffee break.";
    }
}
