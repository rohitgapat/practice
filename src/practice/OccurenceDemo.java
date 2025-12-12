package practice;

import java.util.HashMap;
import java.util.Map;

public class OccurenceDemo {
	
	public static void main(String [] arg) {
		String name="roheeeter";
		char[] ar = name.toCharArray();
		Map m1 = new HashMap<Character,Integer>();
		for (int i=0;i<name.length();i++) {
			Integer val = (Integer)m1.get(ar[i]);
			if(val == null) {
				m1.put(ar[i], 1);
			}else {
				m1.put(ar[i], val+1);
			}
	
		}
		
		System.out.print(m1.toString());
	}

}