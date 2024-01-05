package org.launchcode;

public abstract class BaseDisk {
    private String title;
    private Double length;
    private Double storageCapacity;
    private String creator;
    private String filetype;

    public BaseDisk(String title, Double length, Double storageCapacity, String creator, String filetype) {
        this.title = title;
        this.length = length;
        this.storageCapacity = storageCapacity;
        this.creator = creator;
        this.filetype = filetype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public void storeData(){
        System.out.println("Currently storing Data....");
    }

    public void reportInfo(){
        System.out.println(this);
    }

    public void readDisk(){
        System.out.println("Reading disk...");
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", length=" + length +
                ", storageCapacity=" + storageCapacity +
                ", creator='" + creator + '\'' +
                ", genre='" + filetype + '\'';
    }



}
