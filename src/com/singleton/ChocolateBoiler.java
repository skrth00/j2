package com.singleton;

public class ChocolateBoiler{
  
  private boolean empty;
  private boolean boiled;

  private static ChocolateBoiler uniqueInstance;
  
  private static int numCalled;
  
  private ChocolateBoiler(){}
  public static ChocolateBoiler getInstance(){
  
    if(uniqueInstance==null)
    {
       System.out.println("Creating new instance ....");
      uniqueInstance=new ChocolateBoiler();
    }
    System.out.println("numCalled:"+numCalled++);
    return uniqueInstance;
  }
  public void fill(){
    if(isEmpty()){
    
      empty=false;
      boiled=false;
    }
  }
  public boolean isEmpty()
  {
    return empty;
  }
  
}