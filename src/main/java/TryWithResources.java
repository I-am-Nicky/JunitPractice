import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); ) {
      System.out.print("Enter Input:  ");
      String s = br.readLine();
      System.out.println("Hello " + s);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (Exception e) {
      System.out.println("Something  went wrong");
    } finally {
      System.out.println("BYE!...");
    }
  }
}
