import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageOfAllPassedParametersTest {
  AverageOfAllPassedParameters averageOfAllPassedParameters;

  @BeforeEach
  void setUp() {
    averageOfAllPassedParameters = new AverageOfAllPassedParameters();
    System.out.println("Test started......");
  }

  @AfterEach
  void tearDown() {
    System.out.println("Test completed..........");
  }

  @Test
  void average() {
    int expected = 3;
    assertEquals(expected, averageOfAllPassedParameters.average(5));
  }

  @Test
  void averageOutOfRange() {
    averageOfAllPassedParameters.average(245689632);
  }

  @Test
  void averageWithNegativeValues() {
    int expected = 3;
    assertEquals(expected, averageOfAllPassedParameters.average(-5));
  }
}
