import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsEvenTest {
  IsEven isEven;

  @BeforeEach
  void setUp() {
    isEven = new IsEven();
    System.out.println("Test started.........");
  }

  @AfterEach
  void tearDown() {
    System.out.println("Test completed............");
  }

  @ParameterizedTest
  @ValueSource(ints = {8, 14, 26, 48, 56, 110, 256, 864})
  void isEven(int n) {
    assertTrue(isEven.isEvenOrOdd(n));
  }

  @ParameterizedTest
  @ValueSource(doubles = {13, 69, 45, 33, 49, 63, 75.69, 119, 361})
  void isOdd(double n) {
    assertFalse(isEven.isEvenOrOdd(n));
  }

  @Test
  void isEvenOrOdd() {
    isEven.isEvenOrOdd(89.5689);
  }
}
