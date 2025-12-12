package practice;

import java.util.HashMap;

public class Domo17 {
	
	public static void main(String arg[]) {
		String name = "rohiit";
		HashMap h1= new HashMap();
		char [] c= name.toCharArray();
		
		for (int i=0;i<c.length;i++) {
			Integer count = (Integer) h1.get(c[i]);
			
			if(h1.get(c[i])==null) {
				h1.put(c[i], 1);
			}
			
			else {
				h1.put(c[i], count+1);
			}
		}
		
		System.out.println(h1.toString()); 
	}
}
