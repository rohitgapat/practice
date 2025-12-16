package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class Demo8 {

	public void findDuplicate(int arr[]) {
		HashMap hs = new HashMap();
		
		for (int i=0;i<arr.length;i++) {
			Integer count  = (Integer) hs.get(arr[i]);
			if(count == null) {
				hs.put(arr[i], 1);
			}
			else {
				hs.put(arr[i], count+1);
			}
		}
		countDuplicate(hs);
	}
	
	public void countDuplicate(HashMap<Integer, Integer> hs) {
		for (Map.Entry<Integer, Integer> entry: hs.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public static void main (String [] arg) {
		Demo8 d1 = new Demo8();
		int arr[]= {2,5,4,2,6,7,6,2,5};
		d1.findDuplicate(arr);

	}
}
