package com.iterator.dinermerger.before;

import java.util.*;

public class MenuTestDrive {
    public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
 
    ArrayList pm=pancakeHouseMenu.getMenuItems();
    for(int i=0;i<pm.size();i++){
       MenuItem menuItem = (MenuItem)pm.get(i);
       System.out.print(menuItem.getName());
       System.out.println("\t\t" + menuItem.getPrice());
       System.out.println("\t" + menuItem.getDescription());
    
    }
    
    
        MenuItem[] dm= dinerMenu.getMenuItems();

        for (int i = 0; i < dm.length; i++) {
            MenuItem menuItem = dm[i];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
    
    }
   

        }
    }
