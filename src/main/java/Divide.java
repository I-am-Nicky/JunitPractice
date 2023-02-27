import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide {
  public static void main(String[] args) {
    int i, j, k = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    i = 8;
    int a[] = new int[4];
    try {
      System.out.println("Enter the number:-");
      j = Integer.parseInt(br.readLine());
      k = i / j;
      System.out.println("Output is : " + k);
      for (int c = 0; c <= a.length; c++) {
        a[c] = c + 1;
      }
      for (int value : a) {
        System.out.println(value);
      }
    } catch (NumberFormatException e) {
      System.out.println("Wrong Input");
    } catch (IOException e) {
      System.out.println("some I/o error");
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide it by Zero." + e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bound");
    } catch (Exception e) {
      System.out.println("Unknown Exception");
    } finally {
      try {
        br.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      System.out.println("BYE");
    }
  }
}
