package practice;

import java.util.ArrayList;
import java.util.List;

public class LambadaDemo {

	public static void main(String [] arg) {
		List<String> l1= new ArrayList<String>();
		l1.add("ajay");
		l1.add("Deepak");
		l1.add("sagar");
		l1.forEach(n -> System.out.println(l1));
	}

}
