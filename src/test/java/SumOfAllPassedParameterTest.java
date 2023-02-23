import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfAllPassedParameterTest {
  SumOfAllPassedParameter sumOfAllPassedParameter;

  @BeforeEach
  void setUp() {
    sumOfAllPassedParameter = new SumOfAllPassedParameter();
    System.out.println("Test started......");
  }

  @AfterEach
  void tearDown() {
    System.out.println("Test completed..........");
  }

  @Test
  void add() {
    int expected = 15;
    assertEquals(expected, sumOfAllPassedParameter.add(5));
  }

  @Test
  void addOutOfRange() {
    sumOfAllPassedParameter.add(245689632);
  }

  @Test
  void addWithNegativeValues() {
    int expected = -15;
    assertEquals(expected, sumOfAllPassedParameter.add(-5));
  }
}
