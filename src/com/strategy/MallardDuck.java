package com.strategy;

public class MallardDuck extends Duck{
  
  public MallardDuck(){
  
    quackBehavior = new Quack();
    flyBehavior =new FlyRocketPowered();
  }
  public void display(){
  
    System.out.println("i am real mallard duck");
  }
  
}