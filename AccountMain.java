package day3;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 3) {
			System.out.println("Select account type:1)Savings account,2)Current account");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter name,age,accNo,balance");
				String name = sc.next();
				float age = sc.nextFloat();

				long accNo = sc.nextLong();
				double balance = sc.nextDouble();

				Person p1 = new Person(name, age);
				SavingAcc sa = new SavingAcc(accNo, balance, p1);
				int choice1 = 0;
				while (choice1 != 3) {
					System.out.println("Enter your choice:\n" + "1.Withdraw\n" + "2.View Account\n" + "3.Exit");
					choice1 = sc.nextInt();
					switch (choice1) {

					case 1:
						System.out.println("Enter amount to withdraw");
						int amt = sc.nextInt();
						System.out.println(sa.withdraw(amt));

						break;
					case 2:

						System.out.println(sa);
						break;

					default:
						System.out.println("Please try again!");
					}
				}
				break;

			case 2:
				System.out.println("Enter name,age,accNo,balance");
				String name1 = sc.next();
				float age1 = sc.nextFloat();

				long accNo1 = sc.nextLong();
				double balance1 = sc.nextDouble();

				Person p2 = new Person(name1, age1);
				CurrAccount ca = new CurrAccount(accNo1, balance1, p2);

				int choice2 = 0;
				while (choice2 != 3) {
					System.out.println("Enter your choice:\n" + "1.Deposit\n" + "2.View Account\n" + "3.Exit");
					choice2 = sc.nextInt();
					switch (choice2) {

					case 1:
						System.out.println("Enter amount to deposit");
						int amt = sc.nextInt();
						System.out.println(ca.deposit(amt));

						break;
					case 2:

						System.out.println(ca);
						break;

					default:
						System.out.println("Please try again!");
					}
				}
				break;

			default:
				System.out.println("Ty");

			}

		}
		sc.close();
	}
}
