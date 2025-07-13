package expert.os.examples;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Programmer implements Worker {
    @Override
    public String task(String task) {
        return "Coffee, code, repeat: " + task;
    }

}
