package day3;

public class Accounts{
long accNo;
double balance;
Person accHolder;



public Accounts(long accNo, double balance) {
	
	this.accNo = accNo;
	this.balance = balance;
	
}

public long getAccNo() {
	return accNo;
}

public void setAccNo(long accNo) {
	this.accNo = accNo;
}


public void setBalance(double balance) {
	this.balance = balance;
}




public Person getAccHolder() {
	return accHolder;
}

public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}

double deposit(double amount) {
	this.balance=amount+this.balance;
	return this.balance; 
}



double withdraw(double amount) {
	this.balance=amount+this.balance;
	return balance;
}

@Override
public String toString() {
	return "Accounts [accNo=" + accNo + ", balance=" + balance + ", accHolder=" + accHolder + "]";
}

double getBalance() {
		
return balance;

}


}
