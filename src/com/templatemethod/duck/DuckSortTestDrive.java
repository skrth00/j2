package com.templatemethod.duck;
import java.util.*;
import java.io.*;


public class DuckSortTestDrive {

 public static void main(String[] args) {
  List<Duck> list = new ArrayList<Duck>(); 
   
   list.add(new Duck("Daffy", 8)); 
   list.add(new Duck("Dewey", 2)); 
   list.add(new Duck("Howard", 7)); 
   list.add(new Duck("Louie", 2)); 
   list.add(new Duck("Donald", 10)); 
   list.add(new Duck("Huey", 2)); 
      
   

  System.out.println("Before sorting:");
  for(int i=0;i<list.size();i++)
  { Duck duck=(Duck)list.get(i); 
    System.out.println(duck.getDuckName() + " weighs " + duck.getDuckWeight());
  
  }
  

  
  System.out.println("\nAfter sorting:");
  Collections.sort(list,new DuckComparator());
  for(int i=0;i<list.size();i++)
  { Duck duck=(Duck)list.get(i); 
    System.out.println(duck.getDuckName() + " weighs " + duck.getDuckWeight());
  
  }
 
  
 
  
 }

 
 }
