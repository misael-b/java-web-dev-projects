package org.launchcode;

public class FloppyDisk extends BaseDisk implements Disc{
    public FloppyDisk(String title, Double length, Double storageCapacity, String creator, String filetype) {
        super(title, length, storageCapacity, creator, filetype);
    }

    @Override
    public void spinDisk() {
        System.out.println("Spinning Floppy Disk...");
    }

    @Override
    public void writeData() {
        System.out.println("Writing Floppy Disk...");
    }

    @Override
    public void readData() {
        System.out.println("Reading Floppy Disk...");
    }
}
