package roles;

import static org.junit.Assert.*;

import org.junit.Test;

public class SellerTest {

  @Test
  public void openingMoveTest() {
    Role testSeller = new Seller(0);
    testSeller.move(100, 100);
    assertEquals(20, testSeller.getNext());
  }
  
  @Test
  public void subsequentMoveTest() {
    Role testSeller = new Seller(0);
    testSeller.setCurrent(10);
    testSeller.move(75, 100);
    assertEquals(7, testSeller.getNext());
  }
}
