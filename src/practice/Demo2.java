package practice;

public class Demo2 {

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
			for (int j=0;j<arr.length-1-i;j++) {
				int x=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=x;
			}
		}
		
		print(arr);
	}
	
	public boolean checkPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;	
	}
	
	public void prime() {
		boolean flage=false;
		
		for(int i=2;i<100;i++) {
			flage=true;
			for (int j=2;j<i;j++){
				if(i%j==0) {
					flage=false;
					break;
				}
			}
			if(flage==true) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	
	
	public void print (int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void fibonacci() {
		int a=1;
		int b=1;
		System.out.print(a+" "+b+" ");
		
		for (int i=0;i<8;i++) {
			int add= a+b;
			System.out.print(add+" ");
			
			b=a;
			a=add;
		}
	}
	
	public static void main (String [] arg) {
		Demo2 d1 = new Demo2();
		int arr[]= {23,12,45,32,17};
		d1.bubble(arr);
		d1.reverse(arr);
		System.out.println(d1.checkPrime(27));
		d1.prime();
		d1.fibonacci();	
	}
}
