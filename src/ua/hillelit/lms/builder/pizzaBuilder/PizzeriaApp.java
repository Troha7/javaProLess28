package ua.hillelit.lms.builder.pizzaBuilder;

import ua.hillelit.lms.builder.pizzaBuilder.pizza.HawaiianPizzaBuilder;
import ua.hillelit.lms.builder.pizzaBuilder.pizza.SpicyPizzaBuilder;

public class PizzeriaApp {

  public static void main(String[] args) {

    PizzaChief pizzaChief = new PizzaChief();

    pizzaChief.newPizza(new SpicyPizzaBuilder());
    pizzaChief.buildPizza();
    System.out.println(pizzaChief.getPizza());

    pizzaChief.newPizza(new HawaiianPizzaBuilder());
    pizzaChief.buildPizza();
    System.out.println(pizzaChief.getPizza());
  }
}
