package practice;

public class FindPrime {

	public void getPrime() {
		
		boolean flage=true;
		for (int i=1;i<=100;i++) {
			flage=true;
			for (int j=2;j<i;j++) {
				if(i%j==0) {
					flage=false;
				}
			}
			
			if(flage==true) {
				System.out.println(i);
			}
		}
	}
	
	public static void main (String arg []) {
		FindPrime p = new FindPrime();
		p.getPrime();
	}
}
