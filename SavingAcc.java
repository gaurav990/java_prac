package day3;

public class SavingAcc extends Accounts{

	private Person p1;
	public SavingAcc(long accNo, double balance,Person p1) {
		super(accNo, balance);
		// TODO Auto-generated constructor stub
		this.p1=p1;
	}


	double withdraw(double amount) {
		this.balance=this.balance-amount;
		return balance;
	}


	@Override
	public String toString() {
		return "SavingAcc [accNo=" + accNo + ", balance=" + balance + ", accHolder=" + p1 + "]";
	}


	

	
}
