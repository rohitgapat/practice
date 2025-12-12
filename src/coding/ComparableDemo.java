package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main (String [] arg) {
		
		List<Student> a1 = new ArrayList<>();
		
		a1.add(new Student(3,"Rohit",85));
		a1.add(new Student(1,"Suraj",80));
		a1.add(new Student(2,"Yogesh",75));
		
		Collections.sort(a1);
		
		for(int i=0;i<a1.size();i++){
			System.out.println(a1.get(i));
		}
		
	}
}
