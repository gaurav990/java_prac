package day3;


class Numbers{
	static int count=1;
	Numbers(){
	System.out.println("Instance no:"+(count++));
	
	}
	
}

public class InstanceNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers nos1=new Numbers();
		Numbers nos2=new Numbers();
		Numbers nos3=new Numbers();
		
	}

}
