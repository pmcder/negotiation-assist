package memento;

public class RoleMemento {

  private int limit;

  private double current;

  private boolean limitReached;

  private int volleyCount;

  private double opposingLast;

  private double initial;

  private double opposingInitial;

  /**
   * Holds the state of a role object.
   */
  public RoleMemento(int limit, double current, boolean limitReached, int volleyCount, double opposingLast,
      double initial, double opposingInitial) {
    this.limit = limit;
    this.current = current;
    this.limitReached = limitReached;
    this.volleyCount = volleyCount;
    this.opposingLast = opposingLast;
    this.initial = initial;
    this.opposingInitial = opposingInitial;
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public double getCurrent() {
    return current;
  }

  public void setCurrent(double current) {
    this.current = current;
  }

  public boolean isLimitReached() {
    return limitReached;
  }

  public void setLimitReached(boolean limitReached) {
    this.limitReached = limitReached;
  }

  public int getVolleyCount() {
    return volleyCount;
  }

  public void setVolleyCount(int volleyCount) {
    this.volleyCount = volleyCount;
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

}
