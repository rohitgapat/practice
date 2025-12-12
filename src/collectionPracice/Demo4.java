package collectionPracice;

import java.util.ArrayList;

public class Demo4 {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<String>();
		ArrayList a2= new ArrayList<>();
		
		a1.add("rohit");
		String name = a1.get(0);
		System.out.println(name);
		
		a2.add(4);
		Integer name2= (Integer) a2.get(0);
		System.out.println(name2);

	}
}

class Box<T>{
	T value;
	
}
