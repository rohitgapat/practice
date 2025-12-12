package practice;

import java.util.HashMap;

public class Demo28 {
	
	public static void main (String [] arg) {
		HashMap h=new HashMap();
		String name = "rohiitt";
		char [] arr = name.toCharArray();
		
		for (int i=0;i<arr.length;i++) {
			Integer count = (Integer) (h.get(arr[i]));
			if(count==null) {
				h.put(arr[i], 1);
			}
			else {
				h.put(arr[i], count+1);
			}
		}
		
		System.out.println(h.toString());
	}

}
