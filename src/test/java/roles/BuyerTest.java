package roles;

import static org.junit.Assert.*;
import org.junit.Test;

public class BuyerTest {

  @Test
  public void openingMoveTest() throws InvalidAmountException {
    Role testBuyer = new Buyer();
    testBuyer.move(1000);
    assertEquals(200, testBuyer.getCurrent());
  }

  @Test
  public void subsequentMoveTest() throws InvalidAmountException {
    Role testBuyer = new Buyer();
    testBuyer.move(1000);
    testBuyer.move(750);
    assertEquals(250, testBuyer.getCurrent());
  }

  @Test
  public void limitReachedTest() throws InvalidAmountException {
    Role testBuyer = new Buyer();
    testBuyer.setLimit(240);
    testBuyer.move(1000);
    testBuyer.move(750);
    assertTrue(testBuyer.limitReached);
  }

  @Test
  public void limitNotReachedTest() throws InvalidAmountException {
    Role testBuyer = new Buyer();
    testBuyer.setLimit(300);
    testBuyer.move(1000);
    testBuyer.move(750);
    assertFalse(testBuyer.limitReached);
  }

  @Test(expected = InvalidAmountException.class)
  public void exceptionZeroTest() throws InvalidAmountException {
    Role testBuyer = new Buyer();
    testBuyer.move(0);
  }

  @Test(expected = InvalidAmountException.class)
  public void exceptionNegativeTest() throws InvalidAmountException {
    Role testBuyer = new Buyer();
    testBuyer.move(-12000);
  }

}
