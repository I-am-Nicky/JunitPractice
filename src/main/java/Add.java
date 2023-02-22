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
      System.out.println(sum);
    } catch (OutOfMemoryError e) {
      System.out.println("Integer has crossed it's range");
    } catch (Exception e) {
      System.out.println("Something went wrong");
    }
    return sum;
  }
}
