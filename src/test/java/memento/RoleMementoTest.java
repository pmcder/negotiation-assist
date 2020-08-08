package memento;

import static org.junit.Assert.*;

import org.junit.Test;

import roles.Buyer;
import roles.Role;

public class RoleMementoTest {

  @Test
  public void testUndo() {
    Role testBuyer = new Buyer();
    CareTaker careTaker = new CareTaker();
    testBuyer.move(20000);
    testBuyer.move(17000);
    int i = testBuyer.getCurrent();
    careTaker.addMemento(testBuyer.setMemento());
    testBuyer.move(16200);
    testBuyer.undo(careTaker.getLastMemento());
    assertEquals(i, testBuyer.getCurrent());
  }
  
  @Test
  public void testNotUndo() {
    Role testBuyer = new Buyer();
    CareTaker careTaker = new CareTaker();
    testBuyer.move(20000);
    testBuyer.move(17000);
    int i = testBuyer.getCurrent();
    careTaker.addMemento(testBuyer.setMemento());
    testBuyer.move(16200);
    assertNotEquals(i, testBuyer.getCurrent());
  }

}
