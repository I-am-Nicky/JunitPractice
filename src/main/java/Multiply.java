public class Multiply {
  double a;
  double b;

  public Multiply(double a, double b) {
    this.a = a;
    this.b = b;
  }

  double multi() {
    double multiply = 0;
    try {
      multiply = a * b;
    } catch (NumberFormatException e) {
      System.out.println("Number is  not in the correct format");
    } catch (Exception e) {
      System.out.println("Something went wrong......");
    }
    return multiply;
  }
}
