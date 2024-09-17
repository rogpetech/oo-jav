package composition;

public class EmployeeTest {
  public static void main(String[] args) {
    Date birth = new Date(7, 24, 1984);
    Date hire = new Date(3, 12, 2020);
    Employee employee = new Employee("Rodolfo",
      "Peixoto", birth, hire);

    System.out.println(employee);
  }
}
