package practice;

public class MissingNumber {

	public void findMissing(int arr[]) {
		int f=arr[0];
		int l=arr[arr.length-1];
		boolean flage=false;
		
		for (int i=f;i<l;i++) {
			flage=false;
			for (int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flage=true;
				}
			}
			
			if(flage==false) {
				System.out.println(i);
			}
		}
	}
	
	public static void main (String [] arg) {
		MissingNumber f1 = new MissingNumber();
		int arr[]= {3,4,5,7,8,10};
		f1.findMissing(arr);
	}
}
