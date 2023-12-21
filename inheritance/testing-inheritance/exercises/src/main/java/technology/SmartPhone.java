package technology;

public class SmartPhone extends AbstractEntity{
    private String brand;
    private String model;
    private String id;
    private static int idNum = 1;

    public SmartPhone(double aStorage, String aName, String anOperatingSystem, String aBrand, String aModel) {
        super(aStorage, aName, anOperatingSystem);
        brand = aBrand;
        model = aModel;
        id = this.makeID(2);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String makeId() {
        return id;
    }

    @Override
    public String makeID(int id) {
        String idValue = this.brand.substring(0,3) + "-" + this.model.substring(0,3)+"-"+idNum;
        idNum ++;
        return idValue;
    }
}
