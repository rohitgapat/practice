package java8feature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEachDemo {

	public void itarateArrayList(ArrayList<String> names) {
		names.forEach(name ->  {System.out.println(name);});
	}
	
	public void itarateMap(Map<String, Integer> m1) {
		m1.forEach((key,value) -> {System.out.println(key+" = "+value);});
	}
	
	public static void main (String [] arg) {
		ForEachDemo fe = new ForEachDemo();
		ArrayList<String> name = new ArrayList<String>();
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		m1.put("a", 1);
		m1.put("b", 2);
		m1.put("c", 3);
		m1.put("d", 4);
		
		name.add("rohit");
		name.add("yogesh");
		name.add("rahul");
		name.add("Amit");
		
		fe.itarateArrayList(name);
		fe.itarateMap(m1);
	}
}
