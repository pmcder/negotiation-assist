package roles;

public abstract class Role {

  /**
   * Represents role of the user.
   */

  protected int limit; // max for buyer and min for seller

  protected double current; // current offer for buyer, demand for seller

  protected double next; // what next move should be

  protected boolean limitReached; // returns true when opposing current reaches limit
  
  protected int volleyCount;
  
  protected double opposingLast;

  public Role() {
    this.limitReached = false;
  }

 
  /**
   * Calculates optimal value of next move and updates next field.
   * @param opposingCurrent counterparty's current offer. 
   */
  public abstract void move(double opposingCurrent);

  /**
   * Indicates if limit is a max or min. 
   * @return if limit type for this object is high or low.
   */
  public abstract String getLimitType();

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public boolean getLimitReached() {
    return limitReached;
  }

  public void setLimitReached(boolean limitReached) {
    this.limitReached = limitReached;
  }

  public int getCurrent() {
    return (int) current;
  }

  public void setCurrent(int current) {
    this.current = current;
  }

  public int getNext() {
    return (int) next;
  }

  public void setNext(int next) {
    this.next = next;
  }
  
  public double getOpposingLast() {
    return opposingLast;
  }
  
  public void setOpposingLast(double opposingLast) {
    this.opposingLast = opposingLast;
  }

}
