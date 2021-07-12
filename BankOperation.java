package day3;

import java.util.Scanner;

class Bank{
	int amount;
	int balance;
	
	



public Bank(int amount, int balance) {
		super();
		this.amount = amount;
		this.balance = balance;
	}


int deposit(int amount ,int balance) {
	this.balance=balance+amount;
	return(this.balance);
}	


int withdraw(int amount ,int balance) {
	if (balance==0)
		return 0;
	else {
	this.balance=balance-amount;
	return(this.balance);
}
}


@Override
public String toString() {
	return "Bank [amount=" + amount + ", balance=" + this.balance + "]";
}




}


public class BankOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you acc no,amount,acc balance");
		int acc_no = sc.nextInt();
		sc.nextLine();
		int amount = sc.nextInt();
		int balance = sc.nextInt();
		Bank mn = new Bank(amount,balance);
		int choice =0;
		while (choice != 4) {
		System.out.println("Enter your choice:\n" + "1.Deposit\n" + "2.Withdraw\n" + "3.View Account\n" + "4.Exit");
		choice = sc.nextInt();
		switch (choice) {

		case 1:
		
			System.out.println(mn.deposit(amount, balance));
			break;
		case 2:
			
			System.out.println(mn.withdraw(amount, balance));
			
			break;
		case 3:
			System.out.println(mn);
		
			break;

		default:
			System.out.println("Please try again!");
		}

	}
		sc.close();
	}
}
