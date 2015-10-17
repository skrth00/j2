package com.factory.pizzaaf;

public class SMPizzaIngredientFactory implements PizzaIngredientFactory {
    public Potato createPotato() {
        return new MashedPotato();
    }
   
}