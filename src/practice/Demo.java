package practice;

public class Demo {
	
	public void bubble (int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int x= arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=x;
				}
			}
		}
		print (arr);
	}
	
	public void print (int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		} 
		System.out.println();
	}
	
	public String prime (int num) {
		for (int i=2;i<num;i++) {
			
			if(num%i==0) {
				return "not prime";
			}
		}
		return "prime"; 
	}
	
	public int factorial (int num) {
		int x=1;
		while (num!=0) {
			x=x*num;
			num--;
		}
		return x;
	}
	
	public void fibincci() {
		int a,b;
		a=b=1;
		System.out.print(a+" "+b+" ");
		
		for (int i=0;i<10;i++) {
			int add=a+b;
			System.out.print(add+" ");
			b=a;
			a=add;
		}
	}
	public void reverseString(String name) {
		String res="";
		for (int i=name.length()-1;i>=0;i--) {
			char c= name.charAt(i);
			res=res+c;
				
		}
		System.out.println(res);
	}
	
	
	public void binarySearch (int num, int arr[]) {
		int l=0;
		int h=arr.length;
		for (int i=l;i<h;i++) {
			int mid = (l+h)/2;
			if (arr[mid]==num) {
				System.out.println(mid+" "+arr[mid]);
				break;
			}
			else if(arr[mid]>num) {
				h=mid-1;
			}
			
			else {
				l=mid+1;
			}
		}
		
		System.out.println("number is not available");
	}
	
	public static void main (String [] arg) {
		Demo d1=new Demo();
		int arr[]= {21,32,11,15,19};
		int arr2[]= {12,34,56,78,95};
		d1.bubble(arr);
		System.out.println(d1.prime(23));
		System.out.println(d1.factorial(5));
		d1.fibincci();
		d1.reverseString("rohit");
		d1.binarySearch(12,arr2);
	}
}
