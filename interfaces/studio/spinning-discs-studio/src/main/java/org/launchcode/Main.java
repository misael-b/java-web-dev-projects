package org.launchcode;

public class Main {
    public static void main(String[] args) {

       CD myCD = new CD("CD Title", 30.0, 100.0, "Creator", "Rap", 12, "none");
       DVD myDVD = new DVD("Lion King", 120.0, 500.0, "Creator", "Family", "720p", "Simba, Mufasa, lions");

       myCD.burnDisk();
       myCD.skipSong();
       myCD.readData();
       myCD.spinDisk();


       myDVD.burnDisk();
       myDVD.pauseMovie();
       myDVD.writeData();

    }
}