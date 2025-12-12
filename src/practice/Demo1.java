package practice;

public class Demo1 {	
	public void bubble(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int x= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
			}
		}
		print(arr);
	}
	
	public void reverse(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-i-1;j++) {
				int x= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=x;
			}
		}
		
		print(arr);
	}
	
	public void evev(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]%2==0) {
					int x= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=x;
				}
			}
		}
		print(arr);
	}
	
	public void print(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void prime () {
		for (int i=2;i<100;i++) {
			boolean flage=false;
			for (int j=2;j<i;j++) {
				if(i%j==0) {
					flage=true;
					break;
				}
			}
			
			if(flage==false) {
				System.out.println(i);
			}
		}
	}
	
	public void factorial (int num) {
		int x=1;
		
		while(num!=0) {
			x=x*num;
			num--;
		}
		System.out.println(x);
	}
	
	public void fibonacci() {
		int a=1;
		int b=1;
		System.out.print(a+" "+b+" ");
		
		for (int i=1;i<11;i++) {
			int add = a+b;
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
	
	public void checkPalendrome(String name) {
		String newStr="";
		
		for (int i=name.length()-1;i>=0;i--) {
			char c= name.charAt(i);
			newStr=newStr+c;
		}
		
		if(name.equals(newStr)) {
			System.out.println("String is palendrome");
		}
		else {
			System.out.println("String not is palendrome");

		}
	}
	
	public static void main (String [] arg) {
		Demo1 d1= new Demo1();
		int arr[]  = {21,11,18,14,15};
		d1.bubble(arr);
		d1.reverse(arr);
		d1.evev(arr);
		d1.prime();
		d1.factorial(5);
		d1.fibonacci();
		System.out.println(d1.checkPrime(23));
		d1.checkPalendrome("rohor");
	}
}
