package oopsProblems;

public class Rectangle {

	double width;
	double height;
	
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getArea() {
		return width*height;
		
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
	public static void main(String[]args) {
		Rectangle rectangle=new Rectangle(56,5666);
		System.out.println("The area and perimeter of given rectangle is"+ rectangle.getArea()+"and"+rectangle.getPerimeter()+"respectively");
	}
	
	
	}

