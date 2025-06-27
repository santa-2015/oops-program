package oopsProblems;



 class PersonQ1 {

	private String name;
	private int age;
	//constructor
	public  PersonQ1(String name, int age) {
		this.name=name;
		this.age=age;

}
	//getter setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public static void main(String[]args) {
		//instances
		PersonQ1 person1=new PersonQ1("Sanika",20);
		PersonQ1 person2=new PersonQ1("Vaibhavi",20);
		System.out.println(person1.getName()+"is" +person1.getAge());
		person1.setAge(23);//modifying age
		System.out.println(person1.getName()+"is" +person1.getAge());
		}
	
	
}


	


