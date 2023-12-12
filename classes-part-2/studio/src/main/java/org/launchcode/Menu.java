package org.launchcode;

import java.util.ArrayList;
import java.util.Date;


public class Menu {
    ArrayList <MenuItem> menuItemsList = new ArrayList<>();
    ArrayList <MenuItem> newMenuItems = new ArrayList<>();

    Date date;

    @Override
    public String toString(){
        String results = "Menu Items: ";
        for (MenuItem item: menuItemsList){
            results += "\n*****\n";
            results += "name: " + item.getName();
            results += "\nprice: " + item.getPrice();
            results += "\ndescription: " + item.getDescription();
            results += "\ncategory: " + item.getCategory();
            results += "\n*****\n";
        }
        return results;

    }



    public void addMenuItems(MenuItem menuItem) {

        this.menuItemsList.add(menuItem);
        newItemAdded(menuItem);
        date = new Date();

    }

    public void removeMenuItems(MenuItem menuItem) {
        this.menuItemsList.remove(menuItem);
        this.newMenuItems.remove(menuItem);
        date = new Date();

        //this.newMenuItems.add(menuItems);

    }

    public void newItemAdded (MenuItem menuItem){
        newMenuItems.add(0,menuItem);

    }

    public String getNewestItem(){
        String results= "";
        MenuItem newestItem = newMenuItems.get(0);
        results += "\n*****\n";
        results += "name: " + newestItem.getName();
        results += "\nprice: " + newestItem.getPrice();
        results += "\ndescription: " + newestItem.getDescription();
        results += "\ncategory: " + newestItem.getCategory();
        results += "\n*****\n";
        return results;
    }

    public String lastUpdate(){
        return "the last update to the menu was: " + date;
    }

    public String getSingleMenuItem(MenuItem menuItem){
        String results= "";
        results += "\n*****\n";
        results += "name: " + menuItem.getName();
        results += "\nprice: " + menuItem.getPrice();
        results += "\ndescription: " + menuItem.getDescription();
        results += "\ncategory: " + menuItem.getCategory();
        results += "\n*****\n";
        return results;
    }

//    public string isChanged(ArrayList<MenuItem> menuItems){
//        if (menuItems.getIsChanged()){
//            return dateOfChange
//        }
//    }
}

