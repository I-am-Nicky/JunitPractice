public class AverageOfAllPassedParameters {
  int n;

  double average(int n) {
    int sum = 0;
    double avg = 0;
    try {
      if (n > 0) {
        for (int i = 1; i <= n; i++) {
          sum = sum + i;
        }
        avg = sum / n;
      } else {
        int i = 0;
        int k = n;
        while (n < i) {
          sum = sum + n;
          n++;
        }
        avg = sum / k;
      }
    } catch (ArithmeticException e) {
      System.out.println("Something went wrong!......");
    }
    return avg;
  }
}
