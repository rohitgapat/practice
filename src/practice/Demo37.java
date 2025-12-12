package practice;

public class Demo37 {

	public void findMissing(int arr []) {
		int first=arr[0];
		int last = arr[arr.length-1];
		boolean flage = false;
		
		for (int i=first;i<=last;i++) {
			flage=false;
			for (int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flage=true;
					break;
				}
			}
			
			if(flage==false) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String [] arg) {
		Demo37 d1= new Demo37();
		int arr[]= {3,5,7,9,10};
		d1.findMissing(arr);
	}
}
