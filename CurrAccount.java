package day3;

public class CurrAccount extends Accounts{

	
private Person p2;
	public CurrAccount(long accNo, double balance,Person p2) {
		super(accNo, balance);
		this.p2=p2;
		// TODO Auto-generated constructor stub
	}
	
	double deposit(double amount) {
		this.balance=amount+this.balance;
		return this.balance;
	}

	@Override
	public String toString() {
		return "CurrAccount [accNo=" + accNo + ", balance=" + balance + ", accHolder=" +p2+"]";

	
	}

	}
 


