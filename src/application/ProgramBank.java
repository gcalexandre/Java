package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account(1001, "Alex", 0.0);
		System.out.println(acc);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Account acc1 = bacc;
		System.out.println(acc1);
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		System.out.println(acc4);

		// BusinessAccount acc5 = (BusinessAccount)acc3;

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("LOAN!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("UPDATE!");
		}
		
		System.out.println("--------------------------------");
		System.out.println("Sobreposição");
		
		
		
		Account acc5 = new Account(1001, "Alex", 1000.0);
		acc5.withdraw(200.0);
		System.out.println(acc5.getBalance());
		
		Account acc6 = new SavingsAccount(1002, "MAria", 1000.0, 0.01);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("Super");
		
		Account acc7 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		

	}

}
