package practice;

import java.util.HashMap;

public class Demo13 {

	public static void main (String [] arg) {
		String name="rooheet";
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		for (int i=0;i<name.length();i++) {
			char c= name.charAt(i);
			boolean val= h1.containsValue(1);
			if(val==false) {
				int count=h1.getOrDefault(c, 1);
				h1.put(c, count);
			}
			
			else {
				h1.put(c, 1);
			}
		}
		
		System.out.println(h1);
	}
}
