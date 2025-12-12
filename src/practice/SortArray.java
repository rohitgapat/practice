package practice;

import java.util.Arrays;

public class SortArray {
	public void sortarry(char arr[]) {
		 Arrays.sort(arr);
		 for (char num:arr) {
			System.out.println(num);
			
		 }
		 int index=Arrays.binarySearch(arr, 'w');
			System.out.println(index);
	}
	
	public static void main (String [] arg) {
		SortArray s1 = new SortArray();
		char arr[]= {'r','t','w','b','d'};
		s1.sortarry(arr);
		
		System.gc();
	}

}
