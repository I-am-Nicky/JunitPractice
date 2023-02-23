public class SumOfAllPassedParameter {
  int n;

  int add(int n) {
    int sum = 0;
    try {
      if (n > 0) {
        for (int i = 1; i <= n; i++) {
          sum = sum + i;
        }
      } else {
        int i = 0;
        while (n < i) {
          sum = sum + n;
          n++;
        }
      }
    } catch (Exception e) {
      System.out.println("Out of Range..........");
    }
    return sum;
  }
}
