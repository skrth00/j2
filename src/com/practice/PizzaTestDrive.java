package com.practice;

public class PizzaTestDrive {
 
  public static void main(String[] args)
  {
    PizzaStore hkstore = new HKPizzaStore();
    
    Pizza pizza =hkstore.orderPizza("Olive");
    System.out.println("hankyoung ordered a "+pizza+"\n");

  
  }
  
  
}