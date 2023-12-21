package technology;

public class Computer {
    private final double storage;
    private final String name;
    private final String operatingSystem;

    public Computer(double aStorage, String aName, String anOperatingSystem) {
        storage = aStorage;
        name = aName;
        operatingSystem = anOperatingSystem;
    }

    public double getStorage() {
        return storage;
    }

    public String getName() {
        return name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
