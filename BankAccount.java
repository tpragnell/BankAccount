public class BankAccount{

  private int accountID = 0;
  private String password = "";
  private double balance = 0;

  public BankAccount(int _accountID, String _password){
    this.accountID = _accountID;
    this.password = _password;
    this.balance = 0;
  }

  public double getBalance(){
    return this.balance;
  }

  public int getAccountID(){
    return this.accountID;
  }

  public String toString(){
    String s = "#" + Integer.toString(accountID) + "\t" + "$" + Double.toString(balance);
    return s;
  }

  public void setPassword(String _password){
    this.password = _password;
  }

  public boolean deposit(double _amount){
    if(_amount >= 0){
      this.balance += _amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double _amount){
    if(_amount <= this.balance && _amount >= 0){
      this.balance -= _amount;
      return true;
    }
    return false;
  }

  private boolean authenticate(String _password){
    return _password.equals(this.password);
  }

  public boolean transferTo(BankAccount _other, double _amount, String _password){
    return(authenticate(_password) && withdraw(_amount) && _other.deposit(_amount));
  }

}
