package roles;

public class Seller extends Role {

  public Seller() {
    super();
  }

  @Override
  public void move(double opposingCurrent) {
    if (this.volleyCount == 0) {
      this.current = this.current - (this.current * .20);
      this.opposingLast = opposingCurrent;
      this.volleyCount++;
    } else {
      this.current = this.current - (((opposingCurrent - this.opposingLast) / opposingCurrent) * this.current);
      this.volleyCount++;
      this.opposingLast = opposingCurrent;
      if (this.current <= this.limit) {
        this.limitReached = true;
      }
    }
  }

  @Override
  public String getLimitType() {
    return "lowest";
  }
}
