package practice;

import java.util.HashMap;

public class Demo12 {

	public static void main (String [] arg) {
		String name ="rooheet";
		char arr []= name.toCharArray();
		HashMap h1=new HashMap();
		for (int i=0;i<arr.length;i++) {
			Integer val = (Integer) h1.get(arr[i]);
			if(val==null) {
				h1.put(arr[i], 1);
			}
			else {
				h1.put(arr[i], val+1);
			}
		}
		
		 
		System.out.println(h1.toString());
		
	}
}
