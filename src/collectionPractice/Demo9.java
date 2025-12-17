package collectionPractice;

import java.util.Set;
import java.util.TreeSet;

public class Demo9 {

	public void itarateTreeSetUsingLambada(Set<Integer> s1) {
		s1.forEach(value ->  {System.out.println(value);});
		System.out.println();
	}
	
	public void itarateSet(Set<Integer> s1) {
		for (Integer value : s1) {
			System.out.println(value);
		}
	}
	
	public static void main (String [] arg) {
		Demo9 d1 = new Demo9();
		Set<Integer> s1 = new  TreeSet<Integer>();
		
		s1.add(5);
		s1.add(8);
		s1.add(2);
		s1.add(9);
		s1.add(4);
		
		d1.itarateTreeSetUsingLambada(s1);
		d1.itarateSet(s1);
 	}
}
