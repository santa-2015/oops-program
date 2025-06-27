package PolymorphismInheritance;

public class Animal {

public void Sound() {
		
		System.out.println("The animal makes sound");
	}
public static void main(String[]args) {
	Animal animal=new Animal();
	Bird bird=new Bird();
	Cat cat=new Cat();
	
	animal.Sound();
	bird.Sound();
cat.Sound();
}

}
