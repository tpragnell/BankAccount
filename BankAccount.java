public class BankAccount{

  private int accountID = 0;
  private String password = "";
  private double balance = 0;

  public BankAccount(int _accountID, String _password){
    accountID = _accountID;
    password = _password;
    balance = 0;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public String toString(){
    String s = Integer.toString(accountID) + "\t" + Double.toString(balance);
    return s;
  }

  public void setPassword(String _password){
    password = _password;
  }

  public boolean deposit(double _amount){
    if(_amount >= 0){
      balance += _amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double _amount){
    if(_amount <= balance && _amount >= 0){
      balance -= _amount;
      return true;
    }
    return false;
  }


  }
