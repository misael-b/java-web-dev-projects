package org.launchcode;

public class DVD extends BaseDisk implements Disc{
    private String resolution;
    private String cast;
    public DVD(String title, Double length, Double storageCapacity, String creator, String filetype, String resolution, String cast) {
        super(title, length, storageCapacity, creator, filetype);
        this.resolution = resolution;
        this.cast = cast;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public void startMovie(){
        System.out.println("Starting Movie...");
    }

    public void pauseMovie(){
        System.out.println("Pausing Movie ... ");
    }

    @Override
    public void spinDisk() {
        System.out.println("Spinning DVD...");
    }

    @Override
    public void writeData() {
        System.out.println("Writing DVD...");
    }

    @Override
    public void readData() {
        System.out.println("Reading DVD...");
    }


    public void burnDisk() {
        System.out.println("Burning DVD...");
    }
}
