package practice;

import java.nio.file.ClosedWatchServiceException;
import java.util.HashMap;
import java.util.Scanner;

public class Demo10 {

	public void addStudent() {
		HashMap h1 = new HashMap();
		for (int i=101;i<106;i++) {
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			h1.put(i, name);
		}
		
		System.out.println(h1.toString());
	}
	
	public static void main (String arg[]) {
		Demo10 d1 = new Demo10();
		d1.addStudent();
	}
}
