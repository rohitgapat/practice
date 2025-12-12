package collectionPracice;

import java.util.ArrayList;

public class Demo2 {

	public void printEven(ArrayList<Integer> nums) {
		
		for (int i=0;i<nums.size();i++) {
			if(nums.get(i)%2==0) {
				System.out.println(nums.get(i));
			}
		}
	}
	
	public static void main (String [] arg) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(9);
		nums.add(10);
		nums.add(12);
		nums.add(17);
		nums.add(16);
		nums.add(19);
		
		Demo2 d1 = new Demo2();
		d1.printEven(nums);
	}
}
