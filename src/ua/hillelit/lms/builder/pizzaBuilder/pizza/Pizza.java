package ua.hillelit.lms.builder.pizzaBuilder.pizza;

public class Pizza {

  private String dough = "";
  private String sauce = "";
  private String topping = "";
  private String name = "";

  public void setDough(String dough) {
    this.dough = dough;
  }

  public void setSauce(String sauce) {
    this.sauce = sauce;
  }

  public void setTopping(String topping) {
    this.topping = topping;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getDough() {
    return dough;
  }

  public String getSauce() {
    return sauce;
  }

  public String getTopping() {
    return topping;
  }

  @Override
  public String toString() {
    return "Pizza{" +
        "dough='" + dough + '\'' +
        ", sauce='" + sauce + '\'' +
        ", topping='" + topping + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
