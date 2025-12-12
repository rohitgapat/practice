package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo11 {

	public void checkKeyIsPresent(HashMap<Integer,String> h1, Integer key,Scanner sc) {
		
		boolean flage=false;
		for (Map.Entry<Integer, String> entry : h1.entrySet()) {
			if(entry.getKey().equals(key)) {
				flage = true;
				
				
				break;
			}
		}
		if(flage==true) {
			System.out.println("key Presents");
		}
		else {
			System.out.println("key is not present add new value");
			String name = sc.next();
			h1.put(key, name);
		}
	}
	
	public static void main(String [] agr) {
		Demo11 d1 = new Demo11();
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(101, "deepak");
		h1.put(102, "yogesh");
		h1.put(103, "mahesh");
		h1.put(106,"rahul");
		d1.checkKeyIsPresent(h1,104,sc);
		//d1.checkKeyIsPresent(h1,104,sc);
	
	}
	
}
