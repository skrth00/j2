package com.practice;

//pizzafm

public abstract class Pizza{
  
  String name;
  Olive olive;

  abstract void prepare();
  
  void bake()
  {System.out.println("-------baking-------");}
  void cut()
  {System.out.println("-------cutting-------");}
  void boxing()
  {System.out.println("-------boxing--------");}
  
  public void setName(String name)
  {
    this.name=name;
  }
  public String getName()
  {
    return name;
  }
  public String toString(){
  
    System.out.println("--------"+name+"--------");
    return name;
  }
  
}