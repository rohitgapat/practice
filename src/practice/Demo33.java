package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo33 {
	HashMap h = new HashMap();
	ArrayList a= new ArrayList(); 
	public void findCount() {
		
		String sen = "Rohit is learning Java and Rohit likes Java";
		for (int i=0;i<sen.length();i++) {
			String subStr="";
			char c = sen.charAt(i);
			if(c!=' ') {
				subStr=subStr+c;
			}
			
			else {
				a.add(subStr);
			}

		}
		
		System.out.println(a.toString());
		//countValue(a);
	}
	
	/*
	 * public void countValue(ArrayList a) {
	 * 
	 * Integer val = (Integer) h.get(subStr); if(val==null) { h.put(subStr, 1); }
	 * 
	 * else { h.put(subStr, val+1); } System.out.println(h.toString()); }
	 */
	public static void main (String [] arg) {
		Demo33 d1 = new Demo33();
		d1.findCount();
	}
}
