package BankAccount;

public class Transaction {
	// How to create a bank accounts
	public static void main(String[] args) {
		
	
		Account acct1 = new Account("Tom Cruise",72354, 102.56);
		Account acct2 = new Account("Jim Carrey", 69713, 40.00);
		Account acct3 = new Account("Sharika", 93757, 759.32);
		Account acct4 = new Account("Bob Dylan", 56892, 10000.00);
		
		// to deposit money in account 1
		acct1.deposit(25.85);
		
		// to deposit money in account 2 and checking balance
		
		double acct2Balance = acct2.deposit(500);
		System.out.println("Current balance in account 2: " + acct2Balance);
		
		double acct3Balance = acct2.withdraw(50,1.5);
		System.out.println("Current balance in account 3: " + acct3Balance);

		// How to add interest into the account
		acct4.addInterest();
		
		System.out.println();
		System.out.println(acct4);
		
	}

}
