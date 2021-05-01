package edu.uab.ee333.bankinheritance;

/** @author David Green DGreen@uab.edu */
public class BankAccount {

  /** Present balance in account in cents */
  protected int balance;

  /** (Formal) Name of owner of account */
  protected String name;

  /**
   * Constructor with name, initial balance
   *
   * @param name name of account
   * @param balance initial amount in cents
   */
  public BankAccount(String name, int balance) {
    this.name = name;
    this.balance = balance;
  }

  /**
   * getBalance
   *
   * @return present balance in cents
   */
  public int getBalance() {
    return balance;
  }

  /**
   * deposit money into account
   *
   * @param cents amount to add to present balance
   */
  public void deposit(int cents) {
    balance += cents;
  }

  /**
   * withdraw remove money from account
   *
   * @param cents amount to remove from account (if possible)
   * @return boolean true if withdrawal is successful
   */
  public boolean withdraw(int cents) {

    if (cents <= balance) {
      balance -= cents;
      return true;
    }

    return false;
  }

  /**
   * toString return information about account
   *
   * @return string with type, name of account and balance
   */
  @Override
  public String toString() {
    return name + "'s bank account has " + balance + " cents in it at present";
  }

  /**
   * getClassAuthor return name of author
   *
   * @return string containing name of author
   */
  public static String getClassAuthor() {
    return "David G. Green";
  }

  /**
   * Small program to test this class
   *
   * @param args from command line - unused
   */
  public static void main(String[] args) {
    BankAccount mine = new BankAccount("David Green", 200000);

    System.out.println("The account has " + mine.getBalance());
    System.out.println(mine);

    mine.deposit(1000);
    System.out.println(mine);

    mine.withdraw(200000);
    System.out.println(mine);

    // trying to remove much
    boolean status = mine.withdraw(200000);
    System.out.println(mine);
    System.out.println("Withdraw returned " + status);
  }
}
