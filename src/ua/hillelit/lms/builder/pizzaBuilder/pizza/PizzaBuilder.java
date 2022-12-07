package ua.hillelit.lms.builder.pizzaBuilder.pizza;

import ua.hillelit.lms.builder.pizzaBuilder.pizza.Pizza;

public abstract class PizzaBuilder {

  protected Pizza pizza;

  public Pizza getPizza() {
    return pizza;
  }
  public void createNewPizza(){
    pizza = new Pizza();
  }

  public abstract void buildDough();
  public abstract void buildSauce();
  public abstract void buildTopping();
  public abstract void setName();
}
