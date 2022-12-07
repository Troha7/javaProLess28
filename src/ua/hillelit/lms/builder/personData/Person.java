package ua.hillelit.lms.builder.personData;

public class Person {

  private final String firstName;
  private final String lastName;
  private final int age;
  private final String phone;
  private final String address;

  private Person(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.phone = builder.phone;
    this.address = builder.address;
  }

  public static Builder builder(){
    return new Builder();
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        ", address='" + address + '\'' +
        '}';
  }

  public static class Builder {

    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public Person build(){
      return new Person(this);
    }

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

     public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

     public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }
  }

}
