package practice;

public class FindPrimeNum {

	public void findPrime() {
		
		boolean flage =false;
		for (int i=2;i<100;i++) {
			flage=false;
			for (int j=2;j<i;j++) {
				if(i%j==0) {
					flage=true;
				}
			}
			
			if(flage==false) {
				System.out.println(i);
			}
		}
	}
	
	public static void main (String [] arg) {
		FindPrimeNum f1 = new FindPrimeNum();
		f1.findPrime();
	}
}
