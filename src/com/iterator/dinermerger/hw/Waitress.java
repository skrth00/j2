package com.iterator.dinermerger.hw;

public class Waitress {
    ArrayListDinerMenu arrayListDinerMenu;
    DinerMenu dinerMenu;
 
    public Waitress(ArrayListDinerMenu arrayListDinerMenu, DinerMenu dinerMenu) {
        this.arrayListDinerMenu =  arrayListDinerMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu() {
        Iterator arrayListDinerIterator = arrayListDinerMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("\nCase of using ArrayList");
        printMenu(arrayListDinerIterator);
        System.out.println("\nCase of using Array");
        printMenu(dinerIterator);
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            if(menuItem.getVeget()){
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
            }
        }
    }
}