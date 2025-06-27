package oopsProblems;

public class Employee {

	String name;
	String jobTitle;
	int salary;
	
	public Employee(String name,String jobTitle,int salary) {
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void raiseSalary(int percentage){
		salary=salary+salary*percentage/100;
		
	}
	
	
	public static void main(String[]args) {
		Employee employee1=new Employee ("Pdma","attornery",30000);
		Employee employee2=new Employee("sayli","attorney",45000);
		employee1.raiseSalary(9);
	employee2.raiseSalary(23);
		System.out.println("name:"+employee1.getName()+"salary/n"+employee1.getSalary());
		System.out.println("name:"+employee2.getName()+"salary/n"+employee2.getSalary());
		employee1.raiseSalary(16);
		employee2.raiseSalary(24);
	System.out.println(employee1.getSalary());
	System.out.println(employee2.getSalary());
	}
	
	
	
	

}
