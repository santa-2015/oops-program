package oopsProblems;
//incorrect year of service
import java.time.LocalDate;
import java.time.Period;
public class Employee2 {

	String name;
	double salary;
	LocalDate hireDate;
	
	public Employee2(String name,double salary,LocalDate hireDate) {
		this.name=name;
		this.salary=salary;
		this.hireDate=hireDate;
	}
	public String getName(){
		return name;
	}
public void setName(String name) {
	this.name=name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public LocalDate getHireDate() {
	return hireDate;
}
public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}
public int getServiceYears() {
	//new
	return Period.between(hireDate, LocalDate.now()).getYears();

}
public void printEmployeeDetails() {
	System.out.println("Name:"+name);
	System.out.println("Salary:"+salary);
	System.out.println("Hire Date"+hireDate);
	
}
public static void main(String[]args) {
	Employee2 employee2=new Employee2("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
    Employee2 employee3=new Employee2("Magdalena Artemon", 50000, LocalDate.parse("2000-01-15"));
employee2.printEmployeeDetails();
System.out.println("Years of Service: " + employee2.getServiceYears());
employee3.printEmployeeDetails();
System.out.println("Years of Service: " + employee2.getServiceYears());
}
}
