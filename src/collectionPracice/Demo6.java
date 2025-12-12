package collectionPracice;

import java.util.HashMap;
import java.util.Map;

public class Demo6 {
	
	public void iterateMap(HashMap<String, Integer> h1) {
		
		for (Integer value : h1.values()) {
			
			System.out.println("values = " + value);
		}
		
		//System.out.println(h1.toString());
		
		for (String keys : h1.keySet()) {
			
			System.out.println("keys = " + keys);
		}
		
		for (Map.Entry<String, Integer> entry : h1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue()); 
		}
		
	}

	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		h1.put("Mumbai", 1);
		h1.put("Pune", 2);
		h1.put("Nagpur", 3);
		h1.put("Nashik", 4);
		h1.put("Sambhajinagar", 5);
		
		Demo6 d1 = new Demo6();
		d1.iterateMap(h1);		
	}

}
