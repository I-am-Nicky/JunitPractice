import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AddTest {
  @Test
  void addBothPositiveNumberTest() {
    Add add = new Add(5, 6);
    assertEquals(11, add.sum());
  }

  @Test
  void addOnePositiveOneNegativeNumberTest() {
    Add add = new Add(-1, 5);
    assertEquals(4, add.sum());
  }

  @Test
  void whenBothNumberNegative() {
    Add add = new Add(-1, -8);
    assertEquals(-9, add.sum());
  }

  @Test
  void whenOneNumberIsZero() {
    Add add = new Add(-1, 0);
    assertEquals(-1, add.sum());
  }

  @Test
  void whenIntergerRangeIsCrossed() {
    Add add = new Add(2147483647, 20);
    assertNotEquals(Integer.MAX_VALUE, add.sum());
  }
}
