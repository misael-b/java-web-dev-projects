package org.launchcode;

public class LP extends BaseDisk implements Disc{
    public LP(String title, Double length, Double storageCapacity, String creator, String filetype) {
        super(title, length, storageCapacity, creator, filetype);
    }

    @Override
    public void spinDisk() {
        System.out.println("Spinning LP...");
    }

    @Override
    public void writeData() {
        System.out.println("Writing LP...");
    }

    @Override
    public void readData() {
        System.out.println("Reading LP...");
    }
}
