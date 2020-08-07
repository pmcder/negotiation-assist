package edu.bu.met.cs665;

import java.util.Scanner;
import roles.Role;
import roles.RoleFactory;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

public class Main {

  // private static Logger logger = Logger.getLogger(Main.class);

  /**
   * Main method displays user menus to the console.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Role user = null;

    RoleFactory rf = new RoleFactory();

    // welcome message
    System.out.println("Welcome to Negotiation Assist\n");
    System.out.println("I will help buyers get a low price and sellers get a high price.\n\n"
        + "Are you buying or selling today ?\n\n" + "press 1 for buyer and 2 for seller\n");

    /*
     * Instantiates Role object as a Seller or Buyer based on user input.
     */
    user = rf.getRole(sc.nextInt());

    /*
     * Prompts user to input the max if buyer or min if seller that they are willing to accept.
     */
    System.out.printf("Please enter the %s price you are willing to accept ", user.getLimitType());
    user.setLimit(sc.nextInt());
    System.out.printf("Negotiating will stop when you reach %d \n", user.getLimit());

    /*
     * Negotiating loop prompts user to input counterparty amount
     * and returns suggested move to user.
     * Loop breaks when user is advised when limit is reached. 
     */
    while (!(user.getLimitReached())) {
      System.out.println("\nEnter counterparty amount: ");
      user.move(sc.nextInt());
      System.out.printf("You should move to %d", user.getCurrent());
    }
    System.out.println("\nlimit reached !!!");
  }
}
