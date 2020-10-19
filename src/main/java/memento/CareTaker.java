package memento;

import java.util.Stack;

public class CareTaker {

  Stack<RoleMemento> mementoStack = new Stack<RoleMemento>();

  public void addMemento(RoleMemento rm) {
    this.mementoStack.push(rm);
  }

  public RoleMemento getLastMemento() {
    // TODO add exception for empty?
    return this.mementoStack.pop();
  }

}
