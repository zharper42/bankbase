package edu.uab.ee333.bankinheritance;

/**
 * Model a checking account as a specialization of a bank account
 *
 * @author David Green DGreen@uab.edu
 */
public class CheckingAccount extends BankAccount {

  /**
   * Construct a checking account given
   *
   * @param name owner
   * @param balance in cents
   */
  public CheckingAccount(String name, int balance) {
    super(name, balance);
  }

  /**
   * toString - convert to a string representation showing the name of the checking account and the
   * present balance
   *
   * @return a string representation of a checking account
   */
  @Override
  public String toString() {
    return name + "'s checking account has " + balance + " cents in it at present";
  }

  /**
   * clearCheck - processes a check with overdraft penalty
   *
   * @param cents - amount of check
   * @return boolean - true if the check clears
   */
  public boolean clearCheck(int cents) {
    if (withdraw(cents)) {
      return true;
    } else {
      balance -= 1500;
      return false;
    }
  }

  /** Assess a 150 cent fee each month */
  @Override
  public void assessMonthlyFee() {
    balance -= 150;
  }

  /**
   * Small program to test this class
   *
   * @param args from command line - unused
   */
  public static void main(String[] args) {

    CheckingAccount mine = new CheckingAccount("David Green", 200000);
    System.out.println("The account has " + mine.getBalance());
    System.out.println(mine);

    mine.deposit(1000);
    System.out.println(mine);

    mine.withdraw(200000);
    System.out.println(mine);

    // trying to remove too much
    boolean status = mine.withdraw(200000);
    System.out.println(mine);
    System.out.println("Withdraw returned " + status);

    System.out.println(mine.clearCheck(1));
    System.out.println(mine);

    System.out.println(mine.clearCheck(10000));
    System.out.println(mine);

    mine.assessMonthlyFee();
    System.out.println(mine);
  }
}
