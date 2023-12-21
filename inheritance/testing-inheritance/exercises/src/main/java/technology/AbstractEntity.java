package technology;

public abstract class AbstractEntity extends Computer{


    public AbstractEntity(double aStorage, String aName, String anOperatingSystem) {
        super(aStorage, aName, anOperatingSystem);
    }

    public abstract String makeID(int id);
}
