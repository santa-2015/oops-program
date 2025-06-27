package oopsProblems;

public class Traffic {

String color;
int duration;
public Traffic(String color,int duration) {
	this.color=color;
	this.duration=duration;
}
public void changeColor(String newColor) {
	color=newColor;
}
public boolean isRed() {
	return color.equals("red");
}
public boolean isGreen() {
	return color.equals("green");
}
public boolean isYellow() {
	return color.equals("yellow");
	
	
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration=duration;
}
public static void main(String[]args) {
	Traffic light=new Traffic("red",30);
	System.out.println("The light is red:"+light.isRed());
	
}

}
