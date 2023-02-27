import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
;

class AddititiveAndMultiplicativeInverseTest {
  AddititiveAndMultiplicativeInverse addititiveAndMultiplicativeInverse;

  @BeforeEach
  void setUp() {
    addititiveAndMultiplicativeInverse = new AddititiveAndMultiplicativeInverse(5, 5.23f);
    System.out.println("Test started !");
  }

  @AfterEach
  void tearDown() {
    System.out.println("Test completed....");
  }

  @Test
  void inverse() {
    int expected = -5;
    assertEquals(expected, addititiveAndMultiplicativeInverse.inverse(5));
  }

  @Test
  void inverseF() {
    float expected = 5;
    assertEquals(expected, addititiveAndMultiplicativeInverse.inverse(5));
  }
}
