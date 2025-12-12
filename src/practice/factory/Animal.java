package practice.factory;

public abstract class Animal {
	
	public abstract void typeOfAnimal();
}

class Dog extends Animal {
	public void typeOfAnimal() {
		System.out.println("dog animal is created");
	}
}

class Cat extends Animal{
	public void typeOfAnimal() {
		System.out.println("Cat animal is created");
	}
}

class Tiger extends Animal{
	public void typeOfAnimal() {
		System.out.println("tiger animal is created");
	}
}