package learning.FactoryPattern;

import java.util.Scanner;

public abstract class Vehicle {

	public void print (){
		System.out.println("vehicle is strarting");
	}
	
	public abstract void typeOfVehicle();
}

class Car extends Vehicle {
	public void typeOfVehicle () {
		System.out.println("car is running on highway");
	}
}

class Bike extends Vehicle {
	public void typeOfVehicle() {
		System.out.println("bike is running on two wheels");
	}
}

class Truck extends Vehicle {
	public void typeOfVehicle () {
		System.out.println("truck runnig with heavy load");
	}
}

class MainClass{
	public static void main (String arg []) {
	
		ObjectFactory o1 = new ObjectFactory();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the type");
		String name = sc.next();
		
		try {
		
			Vehicle v1= o1.createObject(name);
			v1.print();
			v1.typeOfVehicle();
		}
		
		catch (InvalidTypeException e) {
			System.out.println(e.getMessage()+" Invalid vehicle type");
		}
		sc.close();
	}
}