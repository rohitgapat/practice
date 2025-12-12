package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Demo23 {

	public static void main (String [] arg) {
		HashMap m1 = new HashMap();
		String name="rohhiit";
		char[] c= name.toCharArray();
		
		for (int i=0;i<c.length;i++) {
			Integer count=(Integer) m1.get(c[i]);
			if(count==null) {
				m1.put(c[i], 1);
			}
			
			else {
				m1.put(c[i], count+1);
			}
		}
		System.out.println(m1.toString());
	}
}
