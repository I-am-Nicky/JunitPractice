public class AddititiveAndMultiplicativeInverse {
  int n;
  float p;

  public AddititiveAndMultiplicativeInverse(int n, float p) {
    this.n = n;
    this.p = p;
  }

  int inverse(int n) {
    int num = 0;
    try {
      num = n * (-1);
    } catch (Exception e) {
      System.out.println("Number is not in the correct format!...");
    }
    return num;
  }

  float inverse(float p) {
    float num = 1f;
    float x = p;
    try {
      x = p * (1 / num);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return x;
  }
}
