package negotiations;

import roles.Role;

public class Negotiation {
  
  /**
   * Holds negotiation information.
   */
  
  private Role userRole;
  
  public Negotiation(Role userRole) {
    this.userRole = userRole;
  }
  
  public Role getUserRole() {
    return userRole;
  }

  public void setUserRole(Role userRole) {
    this.userRole = userRole;
  }

  
  
}
