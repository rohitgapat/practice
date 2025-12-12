package collectionPracice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	public void findDuplicate(ArrayList<String> names) {
		names.add("Rohit");
		names.add("Rohan");
		names.add("Rohit");
		names.add("Yogesh");
		names.add("Akash");
		names.add("Manoj");
		names.add("Rohit");
		names.add("Yogesh");
		names.add("Manoj");
		names.add("Rohit");
		Collections.sort(names);
		System.out.println(names);
		Set<String> dupName = new HashSet<String>();
		
		boolean flage = false;
		
		for (int i=0;i<names.size();i++) {
			flage=false;
			for (int j=i+1;j<names.size();j++) {
				if(names.get(i).equals(names.get(j))) {	
					flage=true;
				}
			}
			if(flage==true) {
				String newName=names.get(i);
				dupName.add(newName);
			}
		}
	
		System.out.println(dupName.toString());
	}
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Demo1 d1 = new Demo1();
		d1.findDuplicate(names);
	}
}