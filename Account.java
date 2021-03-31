

public class Account {
	 private int accountNumber;
	 private int currentBalance;
	 

	 public void credit(int amt) {
		 
		 currentBalance = currentBalance + amt;
	 }
	 
	 public void debit(int amt) {
		 int tempBalance = currentBalance - amt;
		 if (tempBalance < 0) {
			 int i = 1 ;
			 System.out.println(i);
	 }
		 
	 currentBalance = tempBalance;
	 
	 }
	 
	 
	 public void setCurrentBalance(int currentBalance) {
		 this.currentBalance = currentBalance;
	 }
	 
	 public int getCurrentBalance() {
		 return currentBalance;
	 }
	 
	 public void setAccountNumber(int accountNumber) {
		 this.accountNumber = accountNumber;
	 }
	 
	 public int getAccountNumber() {
		 return accountNumber;
		 
	 }
	 
	} 
