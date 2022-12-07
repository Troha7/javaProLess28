package ua.hillelit.lms.builder.coffeeBuilder;

public class CoffeeMakerApp {

  public static void main(String[] args) {

    Coffee coffee1 = Coffee.builder()
        .beans("Java")
        .water(250.0)
        .build();
    System.out.println(coffee1);
  }
}
