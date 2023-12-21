package technology;

public class Laptop extends AbstractEntity{
    private String brand;
    private String model;
    private String id;
    private static int idNum = 1;

    public Laptop(double aStorage, String aName, String anOperatingSystem, String aBrand, String aModel) {
        super(aStorage, aName, anOperatingSystem);
        brand = aBrand;
        model = aModel;
        id = this.makeID(2);
        idNum ++;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    @Override
    public String makeID(int id) {
        return this.getBrand().substring(0,3) + "-" + this.getModel().substring(0,3)+"-"+idNum;




    }
}
