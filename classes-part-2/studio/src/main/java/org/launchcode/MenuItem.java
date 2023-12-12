package org.launchcode;


import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;


    private Boolean isChanged;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;

    }

    public String getName() {
        return name;
    }

    public Boolean getIsChanged(){
        return isChanged;
    }

    public void setName(String name) {
        this.name = name;
        this.isChanged = true;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.isChanged = true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.isChanged = true;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
        this.isChanged = true;
    }

    @Override
    public boolean equals(Object toBeCompared){
        if(toBeCompared == this){
            return true;
        }
        if (toBeCompared == null){
            return false;
        }
        if (getClass() != toBeCompared.getClass()){
            return false;
        }
        MenuItem item = (MenuItem) toBeCompared;
        return (item.getName().equals(getName()));

    }


}
