package roles;

public class Buyer extends Role {

  public Buyer(int limit) {
    super(limit);
  }

  @Override
  public void move(double opposingCurrent, double opposingLast) {
    if (opposingCurrent == opposingLast) {
      this.next = (int) (opposingCurrent * .20); 
    }
    
    else {
      this.next = ((opposingCurrent/opposingLast) * this.current);
    }
  }
}
