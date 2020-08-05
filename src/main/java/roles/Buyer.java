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
    if (opposingCurrent == opposingLast) { //checks to see if opening offer
      this.next = (int) (opposingCurrent * .20); // cast to int as fields should always be whole numbers
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
