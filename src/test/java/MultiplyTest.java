import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyTest {

  @BeforeEach
  void setUp() {
    System.out.println("Test Started.......");
  }

  @AfterEach
  void cleanup() {
    System.out.println("Test completed........");
  }

  @AfterAll
  static void tearDown() {
    System.out.println("All test have been completed.......");
  }

  @Test
  void multiplyWithBothPostiveNumbers() {
    double expected = 30;
    Multiply multiply = new Multiply(5, 6);
    double actual = multiply.multi();
    assertEquals(expected, actual);
  }

  @Test
  void multiplyWithNegativeNumbers() {
    double expected = -30;
    Multiply multiply = new Multiply(5, -6);
    double actual = multiply.multi();
    assertEquals(expected, actual);
  }

  @Test
  void multiplyWithBothNegativeNumbers() {
    double expected = 30;
    Multiply multiply = new Multiply(-5, -6);
    double actual = multiply.multi();
    assertEquals(expected, actual);
  }

  @Test
  void multiplyWithZero() {
    double expected = 0;
    Multiply multiply = new Multiply(0, 6);
    double actual = multiply.multi();
    assertEquals(expected, actual);
  }
}
