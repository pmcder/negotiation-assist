package roles;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuyerTest {

  @Test
  public void openingMoveTest() {
    Role testBuyer = new Buyer();
    testBuyer.move(100, 100);
    assertEquals(20, testBuyer.getNext());
  }
  
  @Test
  public void subsequentMoveTest() {
    Role testBuyer = new Buyer();
    testBuyer.setCurrent(10);
    testBuyer.move(75, 100);
    assertEquals(13, testBuyer.getNext());
  }
  
  @Test
  public void subsequentMoveTest2() {
    Role testBuyer = new Buyer();
    testBuyer.setCurrent(1000);
    testBuyer.move(4500, 5000);
    assertEquals(1111, testBuyer.getNext());
  }
  
  @Test
  public void limitReachedTest() {
    Role testBuyer = new Buyer();
    testBuyer.setCurrent(10);
    testBuyer.setLimit(12);
    testBuyer.move(75, 100);
    assertTrue(testBuyer.limitReached);
  }
  
  @Test
  public void limitNotReachedTest() {
    Role testBuyer = new Buyer();
    testBuyer.setCurrent(10);
    testBuyer.setLimit(14);
    testBuyer.move(75, 100);
    assertFalse(testBuyer.limitReached);
  }
  

  
  
}
