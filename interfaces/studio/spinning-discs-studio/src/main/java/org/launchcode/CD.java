package org.launchcode;

public class CD extends BaseDisk implements Disc{
    int numberOfTracks;
    String features;
    public CD(String title, Double length, Double storageCapacity, String creator, String genre, int numberOfTracks, String features) {
        super(title, length, storageCapacity, creator, genre);
        this.numberOfTracks = numberOfTracks;
        this.features = features;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public void skipSong(){
        System.out.println("Skipping song ... ");
    }

    public void playSong(){
        System.out.println("Play song ...");
    }

    @Override
    public void spinDisk() {
        System.out.println("Disk is spinning...");
    }

    @Override
    public void writeData() {
        System.out.println("Writing Song...");
    }

    @Override
    public void readData() {
        System.out.println("Reading Song...");
    }


    public void burnDisk() {
        System.out.println("Burning CD...");
    }

}
