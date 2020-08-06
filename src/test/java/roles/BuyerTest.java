package roles;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuyerTest {

  @Test
  public void openingMoveTest() {
    Role testBuyer = new Buyer();
    testBuyer.move(1000);
    assertEquals(200, testBuyer.getCurrent());
  }
  
  @Test
  public void subsequentMoveTest() {
    Role testBuyer = new Buyer();
    testBuyer.move(1000);
    testBuyer.move(750);
    assertEquals(266, testBuyer.getCurrent());
  }
    
  @Test
  public void limitReachedTest() {
    Role testBuyer = new Buyer();
    testBuyer.setLimit(250);
    testBuyer.move(1000);
    testBuyer.move(750);
    assertTrue(testBuyer.limitReached);
  }
  
  @Test
  public void limitNotReachedTest() {
    Role testBuyer = new Buyer();
    testBuyer.setLimit(267);
    testBuyer.move(1000);
    testBuyer.move(750);
    assertFalse(testBuyer.limitReached);
  }
  

  
  
}
