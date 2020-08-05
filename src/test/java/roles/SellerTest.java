package roles;

import static org.junit.Assert.*;

import org.junit.Test;

public class SellerTest {

  @Test
  public void moveTest() {
    Role testSeller = new Seller();
    testSeller.setCurrent(100);
    testSeller.move(14, 10);
    assertEquals(60, testSeller.getNext());
  }
  
  @Test
  public void limitReachedTest() {
    Role testSeller = new Seller();
    testSeller.setLimit(70);
    testSeller.setCurrent(100);
    testSeller.move(14, 10);
    assertTrue(testSeller.getLimitReached());
  }
  
  @Test
  public void limitNotReachedTest() {
    Role testSeller = new Seller();
    testSeller.setLimit(50);
    testSeller.setCurrent(100);
    testSeller.move(14, 10);
    assertFalse(testSeller.getLimitReached());
  }
  

}
