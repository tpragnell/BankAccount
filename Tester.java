import java.util.Scanner;

public class Tester{

    public static void main(String args[]){

      BankAccount b = new BankAccount(5213452, "Assignment12");
      System.out.println(b.getBalance());
      System.out.println(b.getAccountID());
    }
}