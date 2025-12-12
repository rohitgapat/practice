package practice;

public class Prime {
	
	public String checkPrime (int num) {
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				return "not prime";
			}
		}
		
		return "prime";
	}
	
	
	public static void main (String arg[]) {
		Prime p1 = new Prime ();
		System.out.println(p1.checkPrime(27));
	}

}
