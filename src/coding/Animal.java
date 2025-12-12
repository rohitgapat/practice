package coding;

public abstract class Animal {

	public abstract void colour();	
}

class Dog extends Animal{

	public void colour() {
		System.out.println("colour of dog is black");
	}
}

class Cat extends Animal{
	
	public void colour() {
		System.out.println("colour of cat is brown");
	}
}
