package practice.factory;

public class AnimalFactory {

	public Animal createObject(String name) {
		if(name.equalsIgnoreCase("dog")) {
			return new Dog();
		}
		
		else if (name.equalsIgnoreCase("cat")) {
			return new Cat();
		}
		
		else if(name.equalsIgnoreCase("tiger")) {
			return new Tiger();
		}
		
		return null;
	}
}
