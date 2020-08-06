package negotiations;

import roles.Role;

public class Negotiation {

  /**
   * Holds negotiation information.
   */

  private Role userRole;

  private int counterpartyLast;

  // private double percentDiff;

  public Negotiation(Role userRole) {
    this.userRole = userRole;
  }

  public Role getUserRole() {
    return userRole;
  }

  public void setUserRole(Role userRole) {
    this.userRole = userRole;
  }

  public int getCounterpartyLast() {
    return counterpartyLast;
  }

  public void setCounterpartyLast(int counterpartyLast) {
    this.counterpartyLast = counterpartyLast;
  }
}
