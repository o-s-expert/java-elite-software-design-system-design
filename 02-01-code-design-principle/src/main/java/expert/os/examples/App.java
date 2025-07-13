package expert.os.examples;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Team team = new Team();
            team.add("Alice");
            team.add("Bob");
            team.add("Charlie");
            team.getMembers().clear();
        }
    }
}
