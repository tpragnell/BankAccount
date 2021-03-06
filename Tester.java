import java.util.Scanner;

public class Tester{

    public static void main(String args[]){

      BankAccount b = new BankAccount(5213452, "Assignment12");
      System.out.println(b.getBalance());
      System.out.println(b.getAccountID());
      System.out.println(b.toString());

      b.deposit(1000); // Deposit 1000 - Balance should be 1000
      System.out.println(b.toString());
      b.withdraw(500); // Withdraw 500 - Balance should be 500
      System.out.println(b.toString());
      b.deposit(-1); // Deposit -1 - Balance shouldn't change (negative)
      System.out.println(b.toString());
      b.withdraw(501); // Withdraw 501 - Balance shouldn't change (exceeds bal)
      System.out.println(b.toString());

      // To test authenticate make method public
      // System.out.println("Do these passwords match " + b.authenticate("Assignment12"));

      BankAccount b2 = new BankAccount(2543125, "Assignment13");
      boolean su =  b.transferTo(b2,100,"Assignment12"); // Transfer 100 - Balances should be 400,100
      System.out.println("Is transfer successful? " + su);
      System.out.println(b.toString());
      System.out.println(b2.toString());


    }
}
