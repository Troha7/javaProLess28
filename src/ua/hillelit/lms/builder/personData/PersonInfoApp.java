package ua.hillelit.lms.builder.personData;

public class PersonInfoApp {

  public static void main(String[] args) {

    Person person1 = Person.builder()
        .firstName("Di")
        .lastName("Tro")
        .age(32)
        .build();
    System.out.println(person1);
  }
}
