public class Teller {
	public static void main(String[] args) {
		BankAccount cjb = new BankAccount();
		String[] pirate = new String[0];	//main requires a String[] arg, this generates such an arg
		cjb.main(pirate);	//testing out main
		
		/*
		Testing printing their variables to see if we can view them on their own
		It FAILED :(
		Errors: varName has private access in BankAccount
		
		System.out.println(cjb.name);
		System.out.println(cjb.passwd);
		System.out.println(cjb.pin);
		System.out.println(cjb.acctNum);
		System.out.println(cjb.balance);
		*/
		
		cjb.setName("Can Josiah Beautify");
		cjb.setPasswd("TheAnswerIsNo");
		cjb.setPin(32767);
		cjb.setAcctNum(2000000000);
		cjb.setBalance(-100.0);
		
	}


	
}
