package edu.bu.met.cs665;

import java.util.Scanner;
import memento.CareTaker;
import roles.Role;
import roles.RoleFactory;
import roles.Seller;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

public class Main {

  /**
   * Main method displays user menus to the console.
   * @param args not used
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Role user = null;

    RoleFactory rf = new RoleFactory();
    
    CareTaker careTaker = new CareTaker();

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
    System.out.printf("\nNegotiating will stop when you reach %d \n", user.getLimit());
    
    //gets starting price if seller
    if (user.getClass() == Seller.class) {
      System.out.println("Please enter asking price: ");
      user.setCurrent(sc.nextInt());
    }

    /*
     * Negotiating loop prompts user to input counterparty amount
     * and returns suggested move to user.
     * Loop breaks when user is advised when limit is reached. 
     */
    while (!(user.getLimitReached())) {
      System.out.println("\nEnter counterparty amount: ");
      user.move(sc.nextInt());
      System.out.printf("You should move to %d \n", user.getCurrent());
      System.out.println("To undo type 'undo' else press any key to continue");
      String u = sc.next();
      if (u.contentEquals("u")) {
        user.undo(careTaker.getLastMemento());
        System.out.printf("undone! counterparty at %d, you are at %d", (int)user.getOpposingLast(),
            user.getCurrent());
      }
      careTaker.addMemento(user.setMemento());
    }
    System.out.println("\nlimit reached !!!");
  }
}
