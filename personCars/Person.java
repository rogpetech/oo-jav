package personCars;

public class Person extends Object {
  private String name;
  private int age;

  public Person(String name, int age){
    if(name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }

    if(age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }

    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if(name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }

    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if(age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }

    this.age = age;
  }

  public void driver(Car car) {
    if(car == null) {
      println("Error: You need to pass a class.");
    } else {
      println(this.name + " is driving the car model " +
              car.getModel() + " and color " + car.getColor());
    }
  }

  private void println(String message) {
    System.out.println(message);
  }
}
