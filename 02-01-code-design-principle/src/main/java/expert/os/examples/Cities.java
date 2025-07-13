package expert.os.examples;

import java.util.function.Supplier;

public enum Cities implements Supplier<String> {
    NEW_YORK("New York"),
    LOS_ANGELES("Los Angeles"),
    CHICAGO("Chicago"),
    HOUSTON("Houston"),
    PHOENIX("Phoenix");

    private final String cityName;

    Cities(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public String get() {
        return cityName;
    }
}
