package practice;

public class Demo16 {

	public void bubble(int arr[]){
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
			for (int j=0;j<arr.length-1-i;j++) {
				int x=arr[j];
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
					int x=arr[j];
					arr[j]=arr[j+1];
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

	public boolean checkPrime(int num) {
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				return false;	
			}
		}
		return true;
	}

	public void prime() {

		boolean flage=true;
		for (int i=2;i<100;i++) {
			flage=true;
			for (int j=2;j<i;j++){
				if(i%j==0) {
					flage=false;
				}
			}

			if(flage==true) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public int factorial(int num) {
		int x=1;
		while(num!=0)
		{
			x=x*num;
			num--;
		}

		return x;
	}

	public void fibonscci() {
		int a=1;int b=1;
		System.out.print(a+" "+b+" ");
		for (int i=0;i<10;i++) {
			int add=a+b;
			System.out.print(add+" ");
			b=a;
			a=add;
		}
		System.out.println();
	}
	
	public void binarySearch(int arr[],int num) {
		int f=0;
		int l=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			int mid=(f+l)/2;
			if(arr[mid]==num) {
				System.out.println(arr[mid]);
				break;
			}
			else if(arr[mid]>num) {
				l=mid-1;
			}
			else {
				f=mid+1;
			}
		}
	}
	
	public static void main (String [] agr) {
		Demo16 d1 = new Demo16();
		int arr[] = {12,34,56,78,89};
		int arr2[]= {4,5,8,9,3,6};
		d1.bubble(arr2);
		d1.reverse(arr2);
		d1.even(arr2);
		System.out.println(d1.checkPrime(23));
		d1.prime();
		System.out.println(d1.factorial(5));
		d1.fibonscci();
		d1.binarySearch(arr, 89);
	}
}