package com.iterator.dinermerger.hw;

import java.util.*;

public class MenuTestDrive {
    public static void main(String args[]) {
        
        DinerMenu dinerMenu = new DinerMenu();
        ArrayListDinerMenu arrayListDinerMenu=new ArrayListDinerMenu();
 
        Waitress waitress = new Waitress(arrayListDinerMenu,dinerMenu);

        waitress.printMenu();
    }
}