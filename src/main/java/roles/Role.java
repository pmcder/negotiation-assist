package roles;

import memento.RoleMemento;

public abstract class Role {

  /**
   * Represents role of party to a negotiation.
   */

  protected int limit; // max for buyer and min for seller

  protected double current; // current offer for buyer, demand for seller

  protected boolean limitReached; // returns true when opposing current reaches limit

  protected int volleyCount; // stores number of moves made

  protected double opposingLast; // last move by other opposing role

  protected double initial; // starting move amount

  protected double opposingInitial;

  public Role() {
    this.limitReached = false;
  }

  /**
   * Calculates optimal value of next move and updates current field.
   * 
   * @param opposingCurrent counterparty's current offer.
   * @throws InvalidAmountException TODO
   */
  public abstract void move(double opposingCurrent) throws InvalidAmountException;

  /**
   * Indicates if limit is a max or min.
   * 
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

  public double getOpposingLast() {
    return opposingLast;
  }

  public void setOpposingLast(double opposingLast) {
    this.opposingLast = opposingLast;
  }

  public double getInitial() {
    return initial;
  }

  public void setInitial(double initial) {
    this.initial = initial;
  }

  public double getOpposingInitial() {
    return opposingInitial;
  }

  public void setOpposingInitial(double opposingInitial) {
    this.opposingInitial = opposingInitial;
  }
  
  public RoleMemento setMemento() {
    RoleMemento roleMemento = new RoleMemento(this.limit, this.current, this.limitReached, this.volleyCount, this.opposingLast, this.initial, this.opposingInitial);
    return roleMemento;
  }
  
  /**
   * Restores role state to a previous state.
   * @param roleMemento memento object to restore role state to.
   */
  public void undo(RoleMemento roleMemento) {
    this.limit = roleMemento.getLimit();
    this.current = roleMemento.getCurrent();
    this.limitReached = roleMemento.isLimitReached();
    this.volleyCount = roleMemento.getVolleyCount();
    this.opposingLast = roleMemento.getOpposingLast();
    this.initial = roleMemento.getInitial();
    this.opposingInitial = roleMemento.getOpposingInitial();
  }
  
  

}
