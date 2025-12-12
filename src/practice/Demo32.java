package practice;

import java.util.Collections;
import java.util.HashMap;

public class Demo32 {
	
	public static void main (String [] arg) {
		HashMap h = new HashMap();
		String name = "rohhiiht";
		char[] c = name.toCharArray();
		
		for (int i=0;i<c.length;i++) {
			Integer val = (Integer) h.get(c[i]);
			if(val==null) {
				h.put(c[i], 1);
			}
			
			else {
				h.put(c[i], val+1);
			}
		}
		
		System.out.println(h.toString());
	}
}
