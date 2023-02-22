import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class primeNumberTest {
  @ParameterizedTest
  @ValueSource(ints = {5, 11, 7, 13, 17})
  void primeNumberTest(int number) {
    primeNumber primenumber = new primeNumber();
    assertTrue(primenumber.Validate(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {8, 6, 14, 25, 39})
  void notPrimeNumberTest(int number) {
    primeNumber primenumber = new primeNumber();
    assertFalse(primenumber.Validate(number));
  }
}
