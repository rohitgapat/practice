package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class Demo7 {
	
	public void itarateOnKey(HashMap<String, Integer> hs) {
		for (String key : hs.keySet()) {
			System.out.println("key = "+key);
		}
	}
	
	public void itatateOnValues(HashMap<String, Integer> hs) {
		for (Integer value : hs.values()) {
			System.out.println("value = "+ value);
		}
	}
  
	
	
	public void itarateOnKeyAndValue(HashMap<String, Integer> hs) {
		for (Map.Entry<String , Integer> entry : hs.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
	
	public void itarateOnKeyAndValueUsingLambda(HashMap<String, Integer> hs) {
		hs.forEach((key,value) -> {System.out.println(key+" = "+value);});
	}
	
	public void itrateKeyUsingLambda(HashMap<String, Integer> hs) {
		
	}
	
	public static void main (String [] arg) {
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		Demo7 d1 = new Demo7();
		
		hs.put("r", 10);
		hs.put("t", 20);
		hs.put("m", 12);
		hs.put("e", 16);
		hs.put("v", 14);
		
		d1.itarateOnKey(hs);
		d1.itatateOnValues(hs);
		d1.itarateOnKeyAndValue(hs);
		d1.itarateOnKeyAndValueUsingLambda(hs);
	}
}
