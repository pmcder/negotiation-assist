package roles;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

public class SellerTest {
  
  private static Logger logger = Logger.getLogger(SellerTest.class);

  @Test
  public void moveTest() {
    Role testSeller = new Seller();
    testSeller.setCurrent(100);
    testSeller.move(14);
    assertEquals(80, testSeller.getCurrent());
  }
  
  @Test
  public void limitReachedTest() {
    Role testSeller = new Seller();
    testSeller.setLimit(85);
    testSeller.setCurrent(100);
    testSeller.move(14);
    logger.fatal(testSeller.getCurrent());
    testSeller.move(20);
    logger.fatal(testSeller.getCurrent());
    assertTrue(testSeller.getLimitReached());
  }
  
  @Test
  public void limitNotReachedTest() {
    Role testSeller = new Seller();
    testSeller.setLimit(60);
    testSeller.setCurrent(100);
    testSeller.move(30);
    logger.fatal(testSeller.getCurrent());
    testSeller.move(35);
    logger.fatal(testSeller.getCurrent());
    assertFalse(testSeller.getLimitReached());
  }
}
