package oopsProblems;

 class Dog {

	String name;
	String breed;
	 public Dog(String name,String breed) {
		 this.name=name;
		 this.breed=breed;
		 
	 }
	 public String getName() {
		 return name;
		 
	 }
	 public String getBreed() {
		 return breed;
	 }
	 public void setName(String name) {
		 this.name=name;
		 
	 }
	 public void setBreed(String breed) {
		 this.breed=breed;
	 }
	 public static void main(String[]args) {
		 Dog Dog1=new Dog("Zoomy","Labra");
		 Dog Dog2=new Dog("Tommy","Pug");
		 
		 System.out.println(Dog1.getName()+ "is of breed"+Dog1.getBreed());
		 System.out.println(Dog2.getName()+ "is of breed"+Dog2.getBreed());
	Dog2.setName("tuntun");
	System.out.println(Dog2.getName()+ "is of breed"+Dog2.getBreed());
	 }
	

}
