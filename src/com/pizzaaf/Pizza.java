package com.factory.pizzaaf;

abstract public class Pizza{

         String name;
        abstract void prepare(){
        System.out.println("preparing..");
    }
         void bake(){
        System.out.println("baking..");
    }
          void cut(){
        System.out.println("cutting..");
    }
          void box(){
        System.out.println("boxing..");
    }
    


        public String getName(){
              return name;
             }
          public String toString(){
             System.out.println("---------------"+name+"-------------");
          return name;
                       }
}