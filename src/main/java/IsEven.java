public class IsEven {
  int n;

  boolean isEvenOrOdd(int n) {
    try {
      if (n % 2 == 0) {
        return true;
      }
      return false;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
