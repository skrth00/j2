package com.strategy;

public class ModelDuck extends Duck{
  
  public ModelDuck(){
  
    
     flyBehavior =new FlyRocketPowered(); 
     quackBehavior = new Quack();
  }
  public void display(){
  
    System.out.println("i am real model duck");
  }
  
}