package practice;

public class Demo35 {
	
	public void pattern() {
		for (int i=1;i<=5;i++) {
			
			 for (int k=0;k<=5-i;k++) { 
				 System.out.print("  "); 
			 } 
			
			for (int j=0;j<(i-1)+1;j++) {
				 System.out.print("* ");
			}
			for (int l=0;l<i-1;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String [] arg) {
		Demo35 d1 = new Demo35();
		d1.pattern();
	}
}
