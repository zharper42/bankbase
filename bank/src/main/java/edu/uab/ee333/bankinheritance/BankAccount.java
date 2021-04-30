package edu.uab.ee333.bankinheritance;

/** @author David Green DGreen@uab.edu */
public class BankAccount {

  // instance variables
  private int balance; // in cents
  private String name;

  /**
   * Constructor with name, initial balance
   *
   * @param name name of account
   * @param balance initial amount in cents
   */
  public BankAccount(String name, int balance) {}

  /**
   * getBalance
   *
   * @return present balance in cents
   */
  public int getBalance() {
    return 0;
  }

  /**
   * deposit money into account
   *
   * @param cents amount to add to present balance
   */
  public void deposit(int cents) {}

  /**
   * withdraw remove money from account
   *
   * @param cents amount to remove from account (if possible)
   * @return boolean true if withdrawal is successful
   */
  public boolean withdraw(int cents) {
    return true;
  }

  /**
   * toString return information about account
   *
   * @return string with type, name of account and balance
   */
  @Override
  public String toString() {
    return "";
  }

  /**
   * getClassAuthor return name of author
   *
   * @return string containing name of author
   */
  public static String getClassAuthor() {
    return "David G. Green";
  }
}
