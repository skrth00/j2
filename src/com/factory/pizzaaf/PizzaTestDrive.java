package com.factory.pizzaaf;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore SMStore = new SMPizzaStore();
        PizzaStore KMStore = new KMPizzaStore();
     
 
        Pizza pizza = SMStore.orderPizza("potato");
        System.out.println("Ethan ordered a " + pizza + "\n");
        
        Pizza pizza1 = KMStore.orderPizza("potato");
        System.out.println("Jason ordered a " + pizza1 + "\n");
 
       
 }
}