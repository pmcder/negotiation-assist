package roles;

public class Buyer extends Role {

  /**
   * Represents the buyer in a transaction. The buyer is seeking the lowest price
   * from the Seller.
   */
  public Buyer() {
    super();
  }

  @Override
  public void move(double opposingCurrent) throws InvalidAmountException {
    if (opposingCurrent < 1) {
      throw new InvalidAmountException();
    }
    if (this.volleyCount == 0) { // checks to see if opening offer
      this.opposingLast = opposingCurrent;
      // cast to int as fields should always be whole numbers
      this.current = (int) (opposingCurrent * .20);
      this.initial = this.current;
      this.opposingInitial = opposingCurrent;
      this.volleyCount++;
      if (this.current >= this.limit) {
        this.limitReached = true;
      }
    } else {
      this.current = (this.current + ((opposingLast - opposingCurrent) / this.opposingLast) * this.current);
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
