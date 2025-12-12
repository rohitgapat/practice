package practice;

import java.util.HashMap;

public class Demo24 {
 
	public static void main (String [] arg) {
		HashMap h1 = new HashMap();
		String name= "roohiit";
		char[] c = name.toCharArray();
		for (int i=0;i<c.length;i++) {
			Integer count = (Integer)h1.get(c[i]);
			if(count==null) {
				h1.put(c[i], 1);
			}
			
			else {
				h1.put(c[i], count+1);
			}
		}
		
		System.out.println(h1.toString());
	}
}
