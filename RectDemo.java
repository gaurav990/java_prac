package day3;

class Rectangle {
	int length;
	int breadth;

	public Rectangle(int value) {
		super();
		this.length = value;
		this.breadth = value;
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + this.length + ", breadth=" + this.breadth + "]";
	}

}

public class RectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 5;
		Rectangle rc = new Rectangle(val);
		System.out.println(rc);
		Rectangle rc1 = new Rectangle(10, 50);
		System.out.println(rc1);
	}

}
