package practice;

import java.util.HashMap;

public class Demo9 {

	public void findDuplicate(String sen) {
		HashMap h1 = new HashMap();
		String arr[] = sen.split(" ");
		
		for (int i=0;i<arr.length;i++) {
			Integer val = (Integer) h1.get(arr[i]);
			if(val==null) {
				h1.put(arr[i], 1);
			}
			
			else {
				h1.put(arr[1],1+ val);
			}
			
		}
		
		System.out.println(h1.toString());
		
	}
	
	public static  void main(String [] arg) {
		Demo9 h1 = new Demo9();
		h1.findDuplicate("java is oop langague it is");
	}
}
