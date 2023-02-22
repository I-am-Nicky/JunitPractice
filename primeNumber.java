public class primeNumber {
  public Boolean Validate(final int primeNumber) {
    for (int i = 2; i < primeNumber / 2; i++) {
      if (primeNumber % i == 0) {
        return false;
      }
    }
    return true;
  }

  public int inverse(int a) {
    return 0;
  }

  public float inverse(float a) {
    return 0;
  }
}
