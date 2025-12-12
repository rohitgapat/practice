package learning.FactoryPattern;

public class ObjectFactory  {

	public Vehicle createObject(String type) throws InvalidTypeException {
		if(type.equalsIgnoreCase("car")) {
			return new Car();
		}
		
		else if (type.equalsIgnoreCase("bike")) {
			return new Bike();
		}
		
		else if(type.equalsIgnoreCase ("truck")){
			return new Truck();
		}
		
		throw new InvalidTypeException(type); 
	}
}
