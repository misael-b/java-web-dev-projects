package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem hamburger = new MenuItem("hamburger", 8.00, "Thick delicious hamburger", "main course");
        MenuItem nachos = new MenuItem("nacho", 5.00,"tasty nachos", "appetizer" );
        MenuItem chocolateCake = new MenuItem("Chocolate Cake", 10.00, "rich chocolate cake", "dessert");

        Menu menu = new Menu();
        menu.addMenuItems(hamburger);
        menu.addMenuItems(nachos);
        menu.addMenuItems(chocolateCake);
        System.out.println(menu.lastUpdate());



        System.out.println(menu);

        menu.removeMenuItems(hamburger);
        menu.removeMenuItems(nachos);
        System.out.println(menu);
        System.out.println(menu.getNewestItem());
        menu.addMenuItems(hamburger);
        System.out.println(menu.getSingleMenuItem(hamburger));
        System.out.println(hamburger.equals(chocolateCake));
    }
}
