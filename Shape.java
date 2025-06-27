package PolymorphismInheritance;

public class Shape {
//new
	public double Area() {
		return 0;
		
	}
	public static void main(String[]args) {
Circle circle=new Circle(34);
System.out.println("The area is"+circle.Area()); 

Rectangle rectangle=new Rectangle(15,35);
System.out.println("The area is"+rectangle.Area()); 
	}

}
