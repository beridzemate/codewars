import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertTrue(Kata.SubstringTest("Something", "Home"));
    assertFalse(Kata.SubstringTest("Something", "Fun"));
  }
}
