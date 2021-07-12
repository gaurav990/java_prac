package day3;


class Loan {
  
  int loanId;
  String bankName;
  
  int age;
  Loan() {
      super();
      loanId=101;
      bankName="AXIS";
  }
  void showLoanDetails() {
      System.out.println(loanId+"  "+bankName);
      //show();
  }
   void show() {
      System.out.println("super...");
  }
  
}


//sub
class HousingLoan extends Loan{
  int age;
  double loanAmount;
  HousingLoan() {
      super();
      loanAmount=1200000.00;
  }
  void show() {
      System.out.println("sub...");
      
  }
  void showHousingLoanDetails() {
      this.show();
      super.show();
      System.out.println(loanId+"  "+bankName +"   "+loanAmount+"  "+this.age  +"  "+super.age);
  }
}






class SalariedHousingLoan extends Loan {
  String employementType;
  SalariedHousingLoan() {
      
  }
  
}




public class InheritanceDemo {



  public static void main(String[] args) {
      
      HousingLoan h=new HousingLoan();//this invoke super class construtor
      h.showLoanDetails();
      h.showHousingLoanDetails();
      System.out.println(h.loanId+"  "+h.bankName +"  "+h.loanAmount);
      SalariedHousingLoan s=new SalariedHousingLoan();
      
  }



}