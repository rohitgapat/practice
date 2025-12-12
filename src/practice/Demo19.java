package practice;

import java.util.ArrayList;

public class Demo19 {

	public void reverse(ArrayList<Integer> a1) {
		
		for (int i=a1.size()-1;i>=0;i--) {
			System.out.println(a1.get(i));
		}
	}
	
	public void print(ArrayList<Integer> a1) {
		for (Integer num : a1 ) {
			System.out.println(num);
		}
	}
	public static void main (String [] arg) {
		Demo19 d1= new Demo19();
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(2);
		a1.add(7);
		a1.add(9);
		a1.add(12);
		d1.reverse(a1);
		d1.print(a1);
		
	}
}
