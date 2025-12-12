package practice;

public class Year {

	public void calculateYears(int days) {
		int count=0;
		while(days>=365){
			days = days-365;
			count=count +1;
		}

		System.out.println(count+" "+"year"+" "+days+" "+"days");
	}
	
	
	public static void main (String arg []) {
		Year y = new Year();
		y.calculateYears(5000);
	}
}