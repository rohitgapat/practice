package practice;

public class Demo6 {

	public void FindYearAndDay(int days) {
		int years=days/365;
		int remDaydays=days%365;
		
		System.out.println(years + " "+remDaydays);
	}
	
	public void factorial(int num) {
		int x=1;
		while(num!=0) {
			x=x*num;
			num--;
		}
		System.out.println(x);
	}
	
	public int findSumOfAllDigit(int num) {
		int digit=0;
		int sum=0;
		while(num!=0) {
			digit=num%10;
			num=num/10;
			sum=sum+digit;
		}
		return sum;
	}
	
	public void reversrNumber(int num) {
		int digit=0;
		int newNum=0;
		while(num!=0) {
			digit=num%10;
			num=num/10;
			newNum=(newNum*10)+digit;
		}
		System.out.println(newNum);
	}
	
	
	public void fibonacci() {
		int a=1;
		int b=1;
		System.out.print(a+" "+b+" ");
		for (int i=0;i<10;i++) {
			int add=a+b;
			System.out.print(add+" ");
			b=a;
			a=add;
		}
		System.out.println();
	}
	
	public boolean checkPrime(int num) {
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String [] arg) {
		Demo6 d1 = new  Demo6();
		d1.FindYearAndDay(800);
		d1.factorial(5);
		System.out.println(d1.findSumOfAllDigit(456));
		d1.reversrNumber(12345);
		d1.fibonacci();
		System.out.println(d1.checkPrime(27));
	}
}
