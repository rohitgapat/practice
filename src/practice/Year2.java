package practice;

public class Year2{

	public void findYear(int days) {
		
		int rem=days%365;
		int year=days/365;
		
		System.out.println(year+" "+rem);
	}
	public static void main(String [] arg) {
		Year2 y = new Year2();
		y.findYear(5000);

		
		FunctionalDemo fd = (String name)-> {
			System.out.println("#########");
			System.out.println(name);
			
			};
		
		fd.printName("rohit gapat");
		
		
	}
	
	
}
