package ua.hillelit.lms.builder.pizzaBuilder;

import ua.hillelit.lms.builder.pizzaBuilder.pizza.Pizza;
import ua.hillelit.lms.builder.pizzaBuilder.pizza.PizzaBuilder;

public class PizzaChief {

  private PizzaBuilder pizzaBuilder;

  public void newPizza(PizzaBuilder newPizza){
    pizzaBuilder = newPizza;
  }
  public Pizza getPizza(){
    return pizzaBuilder.getPizza();
  }
  public void buildPizza(){
    pizzaBuilder.createNewPizza();
    pizzaBuilder.buildDough();
    pizzaBuilder.buildSauce();
    pizzaBuilder.buildTopping();
    pizzaBuilder.setName();
  }
}
