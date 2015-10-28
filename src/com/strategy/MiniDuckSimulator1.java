package com.strategy;

public class MiniDuckSimulator1{

  public static void main(String[] args){
  
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();
    
    
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
    
    
  }
}