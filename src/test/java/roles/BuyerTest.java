package roles;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuyerTest {

  @Test
  public void openingMoveTest() {
    Role testBuyer = new Buyer(0);
    testBuyer.move(100, 100);
    assertEquals(20, testBuyer.getNext());
  }
  
  @Test
  public void subsequentMoveTest() {
    Role testBuyer = new Buyer(0);
    testBuyer.setCurrent(10);
    testBuyer.move(75, 100);
    assertEquals(7, testBuyer.getNext());
  }
  
  
}
