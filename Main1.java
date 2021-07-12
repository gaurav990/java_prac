package day3;

import java.util.Scanner;

class Account {
	int accountNo;
	String accountType;
	int accountBalance;

	void setAccountDetails(int accountNo, String accountType, int accountBalance) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	int withdraw() {
		if (accountBalance > 1000)
			return (accountBalance - 1000);
		else {
			System.out.println("Insufficient balance");
			return 0;
		}
	}

	int deposit() {
		System.out.println("balance=" + accountBalance + 1000);
		return (accountBalance + 1000);

	}

	void displayAccountDeatils() {
		System.out.println(accountNo + " " + accountType + " " + accountBalance);
	}

}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account mn = new Account();
		System.out.println("Enter you acc no,acc type,acc balance");
		int acc_no = sc.nextInt();
		sc.nextLine();
		String acc_type = sc.nextLine();
		int balance = sc.nextInt();
		mn.setAccountDetails(acc_no, acc_type, balance);

		System.out.println("Enter your choice:\n" + "1.Deposit\n" + "2.Withdraw\n" + "3.View Account\n" + "4.Exit");
		int choice = sc.nextInt();
		if (choice == 4) {
			System.out.println("ty");
		} else {
			switch (choice) {
			case 1:
				mn.deposit();
				break;
			case 2:
				mn.withdraw();
				break;
			case 3:
				mn.displayAccountDeatils();
				break;

			default:
				System.out.println("Please try again!");
			}

		}
		sc.close();
	}
}
