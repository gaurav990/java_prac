package day3;

import java.util.Scanner;

class Student {
	int rollNo;
	String name;
	int mark1;
	int mark2;
	int mark3;
	int total;

	void setStudDetails(int rollNo, String name, int mark1, int mark2, int mark3) {
		this.rollNo = rollNo;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;

	}

	void findTotal() {
		total = mark1 + mark2 + mark3;

	}

	void dispStudDetails() {

		System.out.println("RollNo:" + rollNo + "\n" + "Name:" + name + "\n" + "Mark1:" + mark1 + "\n" + "Mark2:"
				+ mark2 + "\n" + "Mark3:" + mark3 + "\n" + "Total:" + total);
	}

}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student mn = new Student();
		int choice = 0;
		while (choice != 3) {
			System.out.println("Enter your choice:\n" + "1.Enter details\n" + "2.View Details\n" + "3.Exit");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter you RollNo,Name,Mark1,Mark2,Mark3");
				int roll_no = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				int mark1 = sc.nextInt();
				int mark2 = sc.nextInt();
				int mark3 = sc.nextInt();
				mn.setStudDetails(roll_no, name, mark1, mark2, mark3);

				break;
			case 2:
				mn.findTotal();
				mn.dispStudDetails();
				break;

			default:
				System.out.println("Please try again!");
			}

		}
		sc.close();
	}

}
