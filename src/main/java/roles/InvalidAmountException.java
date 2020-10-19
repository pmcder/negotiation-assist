package roles;

public class InvalidAmountException extends Exception {

  private static final long serialVersionUID = 1L;

  /**
   * Throw when user enters 0 or less for opposing party's current amount.
   */
  public InvalidAmountException() {
  }

}
