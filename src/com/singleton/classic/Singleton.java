package com.singleton.classic;

public class Singleton{
  


  private static Singleton uniqueInstance;
  
  private static int numCalled;
  
  private Singleton(){}
  public static Singleton getInstance(){
  
    if(uniqueInstance==null)
    {
       System.out.println("Creating new instance ....");
      uniqueInstance=new Singleton();
    }
    System.out.println("numCalled:"+numCalled++);
    return uniqueInstance;
  }
}
 