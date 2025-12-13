package practice;

import java.util.HashMap;

public class Demo40 {

	public static void main (String [] arg) {
		HashMap h = new HashMap();
		String name = "roohiitr";
		char [] c = name.toCharArray();
		for (int i=0;i<c.length;i++) {
			Integer count = (Integer) h.get(c[i]);
			if(count==null) {
				h.put(c[i], 1);
			}
			
			else {
				h.put(c[i], count+1);
			}
		}
		
		System.out.println(h);
	}
}
