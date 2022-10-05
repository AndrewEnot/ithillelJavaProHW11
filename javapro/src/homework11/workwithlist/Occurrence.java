package homework11.workwithlist;

public class Occurrence {

  Object name;
  int quantity;

  public Occurrence(Object name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public void print() {
    System.out.println("Object: " + name + " : " + "quantity: " + quantity);
  }

  public Object getName() {
    return name;
  }
}
