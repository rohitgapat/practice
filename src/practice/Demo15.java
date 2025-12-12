package practice;

public class Demo15 {

	public void findMissing(int arr[]) {
		int f=arr[0];
		int l=arr[arr.length-1];
		boolean flage= false;

		for (int i=f;i<l;i++) {
			flage=true;
			for (int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flage=false;
					break;
				}
			
			}
			if(flage==true) {
				System.out.println(i);
			}
		}
	}
	
	public static void main (String [] arg) {
		Demo15 d1= new Demo15();
		int arr[]= {3,4,6,7,8};
		d1.findMissing(arr);
	}
}