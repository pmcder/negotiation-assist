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

}
