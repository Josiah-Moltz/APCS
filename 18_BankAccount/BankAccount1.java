/**
   Clyde "Thluffy" Sinclair
   APCS pd0
   HW18 -- building a more meaningful class
   2021-10-18

   instance variables for storing...
   account holder's full name
   account password
   4-digit PIN
   9-digit account number
   account balance

   and methods for...
   setting each attribute
   printing out all of an account’s info at once
   depositing money
   withdrawing money
**/

public class BankAccount1 {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    pin = newPin;
    return oldPin;
  }

  public int setAcctNum( int newAcctNum ) {
    int oldAcctNum = acctNum;
    acctNum = newAcctNum;
    return oldAcctNum;
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public void withdraw( double withdrawAmount ) {
    balance = balance - withdrawAmount;
  }


  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args ) {
    BankAccount1 ba = new BankAccount1();
    System.out.println(ba.toString());

    //setting bank account values (nothing fancy)
    System.out.println(ba.setName("Can Josiah Beautify?"));
    System.out.println(ba.setAcctNum(226238705));
    System.out.println(ba.setPin((short)8191));
    System.out.println(ba.setPasswd("hackme"));
    System.out.println(ba.setBalance(42.0));
    System.out.println(ba.toString());
    
    //testing deposit
    ba.deposit(58.0);
    System.out.println(ba.toString());
    
    //testing withdraw
    ba.withdraw(100.01);				//1 cent poses a problem with accuracy (-0.01...5)
    System.out.println(ba.toString());
    
    //Testing extremities
    System.out.println(ba.setAcctNum(-1));
    System.out.println(ba.setAcctNum(2000000000));
    System.out.println(ba.setPin((short)-1));		//short will hold negative pins
    System.out.println(ba.setPin((short)99999));	//short will see this as 2 overflows (32767) leaving 31073 behind
    System.out.println(ba.toString());
  }//end main()

}//end class BankAccount
