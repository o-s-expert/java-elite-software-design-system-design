package expert.os.examples;

import java.util.function.Supplier;

public class News implements Supplier<String> {

    private final String title;
    private final String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String get() {
        return "News Title: " + title + "\nContent: " + content;
    }

    @Override
    public String toString() {
        return get();
    }
}
