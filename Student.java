package oopsProblems;
import java.util.ArrayList;
public class Student {

	String name;
	String grade;
	ArrayList courses;
	public Student(String name,String grade)
	{
		this.name=name;
		this.courses=courses;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public ArrayList getCourses() {
		return courses;
	}
	public void setCourses(ArrayList courses) {
		this.courses = courses;
	}
	//adding course method
	public void addCourse(String course) {
		courses.add(course);
	}
	public void removeCourse(String course) {
		courses.remove(course);
	}
	public void printDetails() {
		System.out.println("Nmae"+name);
		System.out.println("Grade"+grade);
		
	}
	public static void main(String[]args) {
		Student student1=new Student("tapsee","4a");
	Student student2=new Student("natasha","2b");
	System.out.println("Student Details:");
	student1.printDetails();
	student2.printDetails();
	System.out.println("Adding courses for " + student1.getName());
	System.out.println("Adding courses for " + student2.getName());
	
	//doubt  student1.addCourse("Math"); 
	  //student1.addCourse("Science");
	  //System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
	}
	
}
