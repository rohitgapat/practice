package practice;

import java.awt.image.RescaleOp;

public class Demo44 {

	public void bubble(int arr[]) {
		for (int i=0;i<arr.length;i++) {
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
			for (int j=0;j<arr.length-i-1;j++) {
				int x= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=x;
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
		print(arr);
	}

	public void print (int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public void findPrimeNumbers() {
		boolean flag=false;
		for (int i=2;i<=100;i++) {
			flag=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}

			if(flag==false) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public String checkPrime(int num) {
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				return "number is not prime";
			}
		}
		return "number is prime";
	}

	public int factirial(int num) {
		int x=1;
		while(num!=0) {
			x=x*num;
			num--;
		}

		return x;
	}

	public void fibonacci() {
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for (int i=0;i<8;i++) {
			int add=a+b;
			System.out.print(add+" ");
			b=a;
			a=add;
		}
		System.out.println();
	}

	public void reverseNumber(int num) {
		int newNum=num;
		int digit=0;
		int revNum=0;

		while(num!=0) {
			digit=num%10;
			num=num/10;
			revNum=(revNum*10)+digit;
		}
		if(newNum==revNum) {
			System.out.println("number is palendrome");
		}
		else {
			System.out.println("number is not palandrome");
		}
	}
	

	public String binarySearch(int arr[] , int num) {
		int first=0;
		int last=arr.length-1;

		for (int i=0;i<arr.length;i++) {
			int mid = (first+last)/2;
			if(arr[mid]==num) {
				return "number is present at "+mid+" index";
			}

			else if(num>arr[mid]) {
				first=mid+1;
			}

			else {
				last=mid-1;
			}
		}
		return "Number is not present";
	}

	public String reverseString(String name) {
		String newStr="";

		for (int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			newStr=c+newStr;
		}
		return newStr;
	}

	public void checkPalendrome(Integer num) {
		Integer oldNum=num;
		Integer digit=0;
		Integer newDegit=0;
		
		while(num!=0) {
			digit=num%10;
			num=num/10;
			newDegit=(newDegit*10)+digit;
		}
		
		if(oldNum.equals(newDegit)) {
			System.out.println("number is palendrome");
		}
		else {
			System.out.println("number is not palendrome");
		}
	}
	
	public static void main(String [] arg) {
		Demo44 d1 = new Demo44();
		int arr[]= {21,19,12,16,11};
		int arr2[]= {3,0,1,5,0,0,6,7};
		int arr3[]= {23,45,67,80,92,97};

		d1.bubble(arr);
		d1.zero(arr2);
		d1.reverse(arr);
		d1.fibonacci();
		System.out.println(d1.factirial(5));
		d1.findPrimeNumbers();
		System.out.println(d1.checkPrime(23));
		d1.reverseNumber(123218);
		System.out.println(d1.binarySearch(arr3, 80));
		System.out.println(d1.reverseString("rohit"));
		d1.checkPalendrome(1234321);
	}
}
