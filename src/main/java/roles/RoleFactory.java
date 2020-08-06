package roles;

public class RoleFactory {
  
  /**
   * Creates Role objects instantiated to either Buyer or Seller.
   */
  public RoleFactory() {}
  
  /**
   * @param i 1 returns a Buyer and 2 returns a Seller.
   * @return a Role object instantiated to a Buyer or Seller.
   */
  public Role getRole(int i) {
    Role role = null;
    if (i == 1) {
      role = new Buyer();
    }
    else if (i==2) {
      role = new Seller();
    }
    return role;
  }
}
