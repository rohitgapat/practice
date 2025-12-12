package practice;

public class Demo21 {

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
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1-i;j++) {
				int x= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=x;
			}
		}
		print(arr);
	}
	
	public void even(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]%2==0) {
					int x= arr[j];
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
	
	public void binarySearch(int arr[],int num) {
		int first=0;
		int last=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			int mid=(first+last)/2;
			if(arr[mid]==num) {
				System.out.println(mid);
				break;
			}
			else if(arr[mid]>num){
				last=mid-1;
			}
			
			else {
				first=mid+1;
			}
		}
	}
	
	public int factorial (int num) {
		int fact=1;
		while(num!=0) {
			fact=fact*num;
			num--;
		}
		return fact;	
	}
	
	public void fibonacci() {
		int a=1;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<8;i++) {
			int add=a+b;
			System.out.print(add+" ");
			b=a;
			a=add;			
		}
		System.out.println();
	}
	
	public String checkPrime(int num) {
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				return "not prime"; 
			}
		}
		return "prime";
	}
	
	public void prime() {
		boolean flage = false;
		for (int i=2;i<100;i++){
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
	
	public void reverseString(String name) {
		String newName="";
		
		for(int i=name.length()-1;i>=0;i--) {
			char c = name.charAt(i);
			newName=newName+c;
		}
		System.out.println(newName);
	}
	
	public int reverseNumber (int num) {
		int digit=0;
		int revNum=0;
		while(num!=0) {
			digit=num%10;
			num=num/10;
			revNum=(revNum*10)+digit;
		}
		return revNum;
	}
	public static void main(String arg []) {
		Demo21 d1= new Demo21();
		int arr[]= {23,45,58,68,72,88};
		int arr2[]= {32,43,12,18,39};
		d1.bubble(arr2);
		d1.even(arr2);
		d1.reverse(arr2);
		d1.fibonacci();
		System.out.println(d1.factorial(5));
		System.out.println(d1.checkPrime(23));
		d1.prime();
		System.out.println(d1.reverseNumber(12345));
		d1.reverseString("rohit");
		d1.binarySearch(arr, 72);
	}
	
}
