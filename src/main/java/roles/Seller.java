package roles;

public class Seller extends Role {

  public Seller() {
    super();
  }

  @Override
  public void move(double opposingCurrent, double opposingLast) {
    // TODO add multiplier here to adjust algorithm ?
    this.next = this.current - (((opposingCurrent - opposingLast) / opposingLast) * this.current);
    if (this.next <= this.limit) {
      this.limitReached = true;
    }
  }

  @Override
  public String getLimitType() {
    return "lowest";
  }
}
