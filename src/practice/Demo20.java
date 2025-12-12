package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Demo20 {
	public void removeDuplicate(ArrayList<String> h1) {
		ArrayList<String> a1 = new ArrayList<String>();
		for(String name :h1) {
			if(!a1.contains(name)) {
				a1.add(name);
			}
		}
		System.out.println(a1);
	}
	
	public void reverse1(ArrayList<String> a1) {
		Set<String> s1= new HashSet<String>(a1);
		System.out.println(s1);
	}
	
	public void reverse2(ArrayList<String> a1) {
		Set<String> s1= new LinkedHashSet<String>(a1);
		System.out.println(s1);
	}
	
	public static void main (String [] arg) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("rohit");
		a1.add("mahesh");
		a1.add("rahul");
		a1.add("mahesh");
		String arr[]= {"bob","sam","cat","bob"};
		Demo20 d1=new Demo20();
		//d1.removeDuplicate(a1);
		d1.reverse2(a1);
		
	}
}
