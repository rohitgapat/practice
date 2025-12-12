package practice;

public class Demo7 {

	public void findMissing(int arr[]) {
		int f=arr[0];
		int l=arr[arr.length-1];
		boolean flage= false;

		for (int i=f;i<=l;i++) {
			flage=true;
			for (int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flage = false;
				}
			}

			if(flage==true) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String [] arg) {
		Demo7 d1 = new Demo7();
		int arr[]= {3,4,5,7,8,10};
		d1.findMissing(arr);
	}
	
}
