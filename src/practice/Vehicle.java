package practice;

public abstract class Vehicle {

	public abstract void start();
}

class Truck extends Vehicle {
	
	public void start() {
		System.out.println("truck running with heavy load");
	}
}

class Bike extends Vehicle{

	public void start() {
		System.out.println("bike is running on two whille");
	}
}

class Car extends Vehicle{
	public void start() {
		System.out.println("car is running on four whille");
	}
}