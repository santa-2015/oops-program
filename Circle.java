package oopsProblems;

public class Circle {

double radius;

public Circle(double radius) {
	this.radius=radius;
	
}
public double getRadius(){
	return radius;
	
}
public void setRadius(double radius) {
	this.radius=radius;
}
public double getArea() {
	return 3.14*radius*radius;
}
public double getCircumference() {
	return 3.14*2*radius;
}
public static void main(String[]args) {
	Circle circle=new Circle(324.24);
	

	circle.setRadius(24);
	System.out.println("The required area is"+circle.getArea()+"and circumference is"+circle.getCircumference());
}
}
