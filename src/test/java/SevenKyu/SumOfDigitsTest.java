package SevenKyu;

import static org.junit.jupiter.api.Assertions.*;

import SevenKyu.SumOfDigits;
import org.junit.jupiter.api.Test;

class SumOfDigitsTest {

  @Test
  void digital_root() {

    assertEquals(  7, SumOfDigits.digital_root(16),"Nope!");
    assertEquals( 6, SumOfDigits.digital_root(456),"Nope!");
  }

  @Test
  void digital_rootOther() {
    assertEquals(  7, SumOfDigits.digital_root(16),"Nope!");
    assertEquals( 6, SumOfDigits.digital_root(456),"Nope!");
  }
}