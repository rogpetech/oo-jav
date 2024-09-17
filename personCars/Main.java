package personCars;

public class Main {
  public static void main(String[] args) {
    try {
      Person person = new Person("Rodolfo", 32);
      System.out.println("Person1 Name:" + person.getName());
  
      person.setName("André da Cunha");
      System.out.println("Person1 Name:" + person.getName());

      Person person2 = new Person("Carla", 31);
      System.out.println("Person2 Name:" + person2.getName());
      
      // Person person3 = new Person(null, -1);
      // System.out.println("Person3 Name:" + person3.getName());

      Car car1 = new Car("kicks", "silver");
      car1.showInformation();
      
      person2.driver(car1);
    } catch (IllegalArgumentException e) {
      System.out.println("Error IllegalArgumentException: " + e.getMessage());
    } 
    catch (Exception e) {
      System.out.println("Error exception: " + e.getMessage());
    }
  }
}