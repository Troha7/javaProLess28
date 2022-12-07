package ua.hillelit.lms.builder.coffeeBuilder;

public class Coffee {

  private final String beans;
  private final double water;

  private Coffee(Builder builder) {
    this.beans = builder.beans;
    this.water = builder.water;
  }

  public static Builder builder(){
    return new Builder();
  }
  public String getBeans() {
    return beans;
  }

  public double getWater() {
    return water;
  }

  @Override
  public String toString() {
    return "Coffee{" +
        "beans='" + beans + '\'' +
        ", water=" + water +
        '}';
  }

  public static class Builder{

    private String beans;
    private double water;

    public Coffee build(){
      return new Coffee(this);
    }
    public Builder beans(String beans) {
      this.beans = beans;
      return this;
    }

    public Builder water(double water) {
      this.water = water;
      return this;
    }
  }
}
