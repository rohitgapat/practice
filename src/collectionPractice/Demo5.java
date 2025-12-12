package collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo5 {
	public void findDuplicateWords(String sen) {
		ArrayList<String> a1 = new ArrayList<String>();
		String newSub="";
		
		for (int i=0;i<sen.length();i++) {
			char c = sen.charAt(i);
			if(c!=' ') {
				newSub=newSub+c;	
			}
			else {
				a1.add(newSub);
				newSub="";
				continue;	
			}
		}
		//System.out.println(a1.toString());
		
		countSentance(a1); 
	}
	
	public void countSentance(ArrayList<String> a1) {
		HashMap h1 = new HashMap();
		
		for (int i=0;i<a1.size();i++) {
			Integer count = (Integer) h1.get(a1.get(i));
			if(count==null) {
				h1.put(a1.get(i), 1);
			}
			
			else {
				h1.put(a1.get(i), count+1);
			}
		}
		System.out.println(h1.toString());
	}
	
	public static void main (String [] arg) {
		Demo5 d1= new Demo5();
		String sen= "Rohit is learning Java and Rohit likes Java ";
		d1.findDuplicateWords(sen);
	}
}
