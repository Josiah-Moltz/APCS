// TNPG Can Josiah Beautify?: Brian Wang, Josiah Moltz, Corina Chen
// APCS
// HW18 -- CPA-One / Building code from UML / Creating a java code for a Bank Account (from UML)
// 2021-10-14

/*
DISCO
- Originally we had the same name for instance variables and function parameters
  This would have led to the awkward statement "name=name;" for two different names

QCC

Team Can Josiah Beautify's Latest and Greatest Q2 Response:
Java still allows us to create an object of class BigSib even though we have not yet written the constructor for BigSib because there is a default constructor. 

Team Can Josiah Beautify's Latest and Greatest Q3 Response:
Print it!?!?!?
When we printed arrays (during the prework), there wasn't an excellent String representation. (there is an Array.toString() that allows us to conveniently print arrays)
However, when printing an Integer, Java prints it very nicely. 
Additionally 


Q2: How do you know BEFORE you wrote your own constructor, that Java provides one for you?
Q3: Describe a test to determine whether Java provides a mean of outping a STRING REPRESENTATION of an OBJECT?
*/


public class BankAccount {
	public String name;
	private Integer accountNum;
	private Integer pin;
	private String password;
	private Double balance; // In cents
	
	public BankAccount() {
		//tbd
	}
	
	public void setName(String inName) {
		name = inName;
	}
	public void setAccountNum(int inAccountNum) {
		accountNum = inAccountNum;
	}
	public void setPin(int inPin) {
		pin = inPin;
	}
	public void setPassword(String inPassword) {
		password = inPassword;
	}
	public void withdraw(Double inAmount) {
		inAmount *= 100;	//Converting from dollars to cents
		balance -= inAmount; 
	}
	public void deposit(Double inAmount) {
		inAmount *= 100;
		balance += inAmount;
	}
	public String printInfo() {
		System.out.println(name);
		System.out.println(accountNum);
		System.out.println(pin);
		System.out.println(password);
		System.out.println(balance);
	}
	
	public static main(String[] args) {
		
	}
}

