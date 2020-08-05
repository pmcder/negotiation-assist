package roles;

public class Buyer extends Role {

  /**
   * Represents the buyer in a transaction. The buyer is seeking the lowest price
   * from the Seller.
   * 
   */
  public Buyer() {
    super();
  }

  @Override
  public void move(double opposingCurrent, double opposingLast) {
    // cast to int as fields should always be whole numbers
    if (opposingCurrent == opposingLast) {
      this.next = (int) (opposingCurrent * .20);
    } 
    else {
      // TODO add multiplier here to adjust algorithm ?
      this.next = ((opposingLast / opposingCurrent) * this.current);
      if (this.next >= this.limit) {
        this.limitReached = true;
      }
    }
  }

  @Override
  public String getLimitType() {
    return "highest";
  }
}
