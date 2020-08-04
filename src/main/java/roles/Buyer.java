package roles;

public class Buyer extends Role {

  /**
   * Represents the buyer in a transaction. The buyer is seeking the lowest price
   * from the Seller.
   * 
   * 
   * @param limit
   */
  public Buyer(int limit) {
    super(limit);
  }

  @Override
  public void move(double opposingCurrent, double opposingLast) {
    // cast to int as fields should always be whole numbers
    if (opposingCurrent == opposingLast) {
      this.next = (int) (opposingCurrent * .20);
    } else if (opposingCurrent <= this.limit) {
      this.limitReached = true;
    } else {
      // TODO add multiplier here to adjust algorithm ?
      this.next = ((opposingLast / opposingCurrent) * this.current);
    }
  }
}
