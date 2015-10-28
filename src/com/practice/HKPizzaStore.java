package com.practice;

//pizzaaf

public class HKPizzaStore extends PizzaStore{
  
  public Pizza createPizza(String item){
    Pizza pizza =null;
  
    PizzaIngredientFactory ingredientFactory=new HKPizzaIngredientFactory();
    if(item.equals("Olive"))
    {
      pizza= new HKstyleOlivePizza(ingredientFactory);//new  HKstyleOlivePizza();
      pizza.setName("it will be changed to hk style OLIVE Pizza");
    }
   return pizza;///
  }

  
}