package Modul2;

public class InternetBanking {
	
	
	 public static void main(String[] args) {
		 
		 
		 Account xAcc = new Account();
		 Account yAcc = new Account();
		 
		 yAcc.setAccountNumber(1);
		 yAcc.setCurrentBalance(1000);
		 
		 yAcc.setAccountNumber(2);
		 yAcc.setCurrentBalance(1200);
		 
	 
	 FundTransfer.transferFunds(xAcc, yAcc, 1400);
	 System.out.println("xAcc’s current balance " + xAcc.getCurrentBalance());
	 System.out.println("yAcc’s current balance " + yAcc.getCurrentBalance());
	 System.out.println("Completed execution of main method");
	 }
	 
	} 