package practice.factory;

public class AnimalMain {

	public static void main(String arg []) {
		AnimalFactory af= new AnimalFactory();
		Animal a1= af.createObject("tiger");	
		a1.typeOfAnimal();
	}
}
