package practice;

public interface FunctionalDemo {
	
	void printName(String name);
	
	default void printAge(int age) {
		System.out.println(age);
	}
	
	public static void printWeight(int weight) {
		System.out.println(weight);
	}
	

}
