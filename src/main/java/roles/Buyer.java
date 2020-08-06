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
  public void move(double opposingCurrent) {
    if (this.volleyCount == 0) { // checks to see if opening offer
      this.opposingLast = opposingCurrent;
      this.current = (int) (opposingCurrent * .20); // cast to int as fields should always be whole numbers
      this.volleyCount++;
    } else {
      // TODO add multiplier here to adjust algorithm ?
      this.current = ((this.opposingLast / opposingCurrent) * this.current);
      this.volleyCount++;
      if (this.current >= this.limit) {
        this.limitReached = true;
      }
    }
  }

  @Override
  public String getLimitType() {
    return "highest";
  }
}
