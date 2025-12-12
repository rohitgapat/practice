package practice;

public class Demo22 {

	public void bubble(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int x=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
			}
		}
		print(arr);
	}
	
	
	public void reverse(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1-i;j++) {
				int x=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=x;
			}
		}
		print(arr);
	}
	
	public void zero(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]==0) {
					int x= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
			}
		}
		print(arr);
	}
	
	public void even (int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if(arr[j]%2==0) {
					int x=  1;
				}
			}
		}
	}
	public void checkPrime(int num) {
		boolean flage=true;
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				flage=false;
				System.out.println("not prime");
			}
		}
		if(flage=true) {
			System.out.println("prime");
		}
	}
	
	public void prime() {
		boolean flage=false;
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
		System.out.println();
	}
	
	public int factorial(int num) {
		int x=1;
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
		for (int i=0;i<10;i++) {
			int next=a+b;
			System.out.print(next+" ");
			b=a;
			a=next;
		}
		System.out.println(); 
	}
	
	public void print(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public void reverseString(String name) {
		String newName="";
		for(int i =0;i<name.length();i++) {
			char c = name.charAt(i);
			newName=c+newName;
		}
		System.out.println(newName);
		
		if(name.equals(newName)) {
			System.out.println("string is palendrome");
		}
		
		else {
			System.out.println("sting is not palendrome");
		}
	}

	public static void main(String[] args) {
		Demo22 d1=new Demo22();
		int[] arr= {32,12,44,54,23,90};
		int arr2[]= {1,4,0,4,0,2,0};
		d1.bubble(arr);
		d1.reverse(arr);
		d1.checkPrime(23);
		d1.prime();
		System.out.println(d1.factorial(5));
		d1.fibonacci();
		d1.reverseString("rohit");
		d1.zero(arr2);
	}

}
