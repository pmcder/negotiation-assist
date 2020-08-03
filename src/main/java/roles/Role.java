package roles;

public abstract class Role {
  
  /**
   * Represents role of the user.
   */
  
  protected int limit; //max for buyer and min for seller
  
  protected double current; //current offer for buyer, demand for seller
  
  protected double next; //what next move should be 
  
  
  public int getNext() {
    return (int) next;
  }

  public void setNext(int next) {
    this.next = next;
  }

  public Role(int limit) {
    this.limit = limit;
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public int getCurrent() {
    return (int) current;
  }

  public void setCurrent(int current) {
    this.current = current;
  }
  
  public abstract void move(double opposingCurrent, double opposingLast);
  
}
