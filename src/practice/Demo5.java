package practice;

import java.util.HashMap;

public class Demo5 {
	public static void main(String [] arg) {
		String name = "roigfggf";
		char c []= name.toCharArray();
		HashMap h1 = new HashMap();
		for (int i=0;i<c.length;i++) {
			Integer val = (Integer) h1.get(c[i]);
			if(val==null) {
				h1.put(c[i], 1);
			}
			else {
				h1.put(c[i], val+1);
			}
		}
		System.out.println(h1.toString());
	}
}

