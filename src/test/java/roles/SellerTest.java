package roles;

import static org.junit.Assert.*;

import org.junit.Test;

public class SellerTest {
  

  @Test
  public void moveTest() throws Exception {
    Role testSeller = new Seller();
    testSeller.setCurrent(100);
    testSeller.move(14);
    assertEquals(80, testSeller.getCurrent());
  }
  
  @Test
  public void limitReachedTest() throws Exception {
    Role testSeller = new Seller();
    testSeller.setLimit(85);
    testSeller.setCurrent(100);
    testSeller.move(14);
    testSeller.move(20);
    assertTrue(testSeller.getLimitReached());
  }
  
  @Test
  public void limitNotReachedTest() throws Exception {
    Role testSeller = new Seller();
    testSeller.setLimit(60);
    testSeller.setCurrent(100);
    testSeller.move(30);
    testSeller.move(35);
    assertFalse(testSeller.getLimitReached());
  }
}
