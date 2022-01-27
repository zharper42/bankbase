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
}
