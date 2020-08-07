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
      this.initial = this.current;
      this.opposingInitial = opposingCurrent;
      this.volleyCount++;
    } else {
      this.current = (this.current + ((opposingLast-opposingCurrent)/this.opposingLast) * this.current);
      this.volleyCount++;
      this.opposingLast = opposingCurrent;
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
