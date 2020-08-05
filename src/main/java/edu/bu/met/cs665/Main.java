package edu.bu.met.cs665;

import java.util.Scanner;

import negotiations.Negotiation;
import roles.Buyer;
import roles.Role;
import roles.Seller;

//import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

  // private static Logger logger = Logger.getLogger(Main.class);

  /**
   * Main method displays user menus to the console.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int userChoice;

    Negotiation negotiation;

    Role user = null;

    System.out.println("Welcome to Negotiation Assist\n");
    System.out.println("I will help buyers get a low price and sellers get a high price.\n\n"
        + "Are you buying or selling today ?\n\n" + "press 1 for buyer and 2 for seller\n");

    userChoice = sc.nextInt();
    if (userChoice == 1) {
      user = new Buyer(0);
    } else if (userChoice == 2) {
      user = new Seller(0);
    }
    System.out.printf("Please enter the %s price you are willing to accept ", user.getLimitType());
  }
}
