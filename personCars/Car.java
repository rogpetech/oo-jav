package personCars;

public class Car {
  private String model;
  private String color;

  public Car(String model, String color) {
    if(model == null || model.isEmpty()){
      throw new IllegalArgumentException("Model need an argument.");
    }

    if(color == null || color.isEmpty()) {
      throw new IllegalArgumentException("Color need an arguement.");
    }

    this.color = color;
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public void setModel(String model) {
    if(model == null || model.isEmpty()) {
      throw new IllegalArgumentException("Model need an arguments.");
    }
    this.model = model;
  }
  
  public void setColor(String color) {
    if(color == null || color.isEmpty()) {
      throw new IllegalArgumentException("Color need an arguement.");
    }

    this.color = color;
  }

  public void showInformation() {
    System.out.println("My car is model: " + this.model + " and color is: " + this.color);
  }
}
