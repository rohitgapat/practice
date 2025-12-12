package practice;

public class Demo31 {

	public void bubble(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int x= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
			}
		}
		print(arr);
	}
	
	public void zero(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]==0) {
					int x=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
			}
		}
		
		print (arr);
	}
	
	public void reverse(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-i-1;j++) {
				int x=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=x;
			}
		}
		print(arr);
	}
	
	public void print (int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" " );
		}
		System.out.println();
	}	
	
	public int factorial (int num) {
		int x= 1;
		while(num!=0) {
			x=x*num;
			num--;
		}
		return x;
	}
	
	public void fibonacci() {
		int a=1;
		int b=1;
		
		System.out.print(a+" "+b+" ");
		
		for (int i=0;i<8;i++) {
			int add = a+b;
			System.out.print(add+" ");
			b=a;
			a=add;
		}
	}
	
	public String checkPrime(int num) {
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				return "not prime";
			}
		}
		
		return "prime";
	}
	
	public void reverseString(String name) {
		String res="";
		for (int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			res= c+res;
		}
		System.out.println(res);
	}
	
	public void checkStringPalendrome(String name) {
		String res="";
		for(int i=name.length()-1;i>=0;i--) {
			char c = name.charAt(i);
			res=res+c;
		}
		System.out.println(res);
		
		if(name.equals(res)) {
			System.out.println("string is palendrome");
		}
		
		else {
			System.out.println("string is not palendrome");
		}
	}
	
	public void findPrime() {
		boolean flage= false;
		for (int i=2;i<100;i++) {
			flage=false;
			for (int j=2;j<i;j++) {
				if(i%j==0) {
					flage=true;
				}
			}
			
			if(flage==false) {
				System.out.print(i+" ");
			}
		}
	}
	
	public int reverseNumber(int num) {
		int digit=1;
		int newNum=0;
		while(num!=0) {
			digit=num%10;
			num=num/10;
			newNum=(newNum*10)+digit;
		}
		return newNum;
	}
	
	public static void main (String [] arg) {
		Demo31 d1 = new Demo31();
		int arr[]= {21,12,18,14,24};
		int arr2[]= {21,0,18,0,13,0,24};
		d1.bubble(arr);
		d1.reverse(arr);
		d1.zero(arr2);
		System.out.println(d1.factorial(5));
		d1.fibonacci();
		System.out.println(d1.checkPrime(23));
		d1.reverseString("rohit"); 
		d1.checkStringPalendrome("gapag");
		d1.findPrime();
		System.out.println(d1.reverseNumber(12345));
	}
}
