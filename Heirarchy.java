package day3;


class Employee{
	String name;
	int salary;
	Employee()
	{
		this.name="abc";
		this.salary=100000;
	}
}


class Manager extends Employee{
	String department;
		Manager(){
			department="comps";
		}
	@Override
	public String toString() {
		return "Manager [department=" + department + ", name=" + name + ", salary=" + salary + "]";
	}
	
}


class Executive extends Manager{
	
		@Override
	public String toString() {
		
		return "Executive [department=" + department + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class Heirarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Employee ex= new Executive();
		System.out.println(ex);
		Employee mg= new Manager();
		System.out.println(mg);
		
		
		

	}

}
