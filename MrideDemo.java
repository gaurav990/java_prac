package day3;






//finall cass cnnot be extend or inherited
class Ride{
  //final variables cannot be modified
//  final 
  int x=10;



  //final methods cannot be overriden
  //final 
  void sq(int s) {
      System.out.println("Area: "+(s*s));
  }
  void show() {
      System.out.println(x);
      
  }
}



class Mride extends Ride{
  
  @Override   // in sub class , dynamic , runtime 
  void sq(int s) {
      System.out.println("Perimeter: "+(4*s));
  }
}




public class MrideDemo {



  public static void main(String[] args) {
      
      
      Ride r=new Ride();
      r.sq(5);
      //Mride m=new Mride();
      r=new Mride();    //dynamically bind to super clas ref to sub clas object
      r.sq(5);      //runtime poly , dynamic poly



  }



}

