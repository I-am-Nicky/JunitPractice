public class Add {
  int a;
  int b;

  public Add(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int sum() {
    int sum = 0;
    try {
      sum = a + b;
      if (sum >= Integer.MAX_VALUE) {
        throw new ArithmeticException();
      }
    } catch (ArithmeticException e) {
      System.out.println("Integer range is crossed.");
    }
    return sum;
  }
}
