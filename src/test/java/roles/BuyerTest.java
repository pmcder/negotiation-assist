package roles;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

public class BuyerTest {
  
  private static Logger logger = Logger.getLogger(BuyerTest.class);

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
    logger.fatal(testBuyer.getCurrent());
    assertEquals(250, testBuyer.getCurrent());
  }
    
  @Test
  public void limitReachedTest() {
    Role testBuyer = new Buyer();
    testBuyer.setLimit(240);
    testBuyer.move(1000);
    logger.fatal(testBuyer.getCurrent());
    testBuyer.move(750);
    logger.fatal(testBuyer.getCurrent());
    assertTrue(testBuyer.limitReached);
  }
  
  @Test
  public void limitNotReachedTest() {
    Role testBuyer = new Buyer();
    testBuyer.setLimit(300);
    testBuyer.move(1000);
    logger.fatal(testBuyer.getCurrent());
    testBuyer.move(750);
    logger.fatal(testBuyer.getCurrent());
    assertFalse(testBuyer.limitReached);
  }
  

  
  
}
