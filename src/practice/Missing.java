package practice;

public class Missing {
	
	int numbers[] = new int[5];
	int index;

	public void findMissingNumber(int arr[]) {
		int l=arr[0];
		int h=arr[arr.length-1];
		boolean flage = true;
		
		for (int i=l;i<=h;i++) {
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
	
	public static void main (String arg[]) {
		Missing m1 =new Missing();
		int arr[]= {5,6,7,9,11};
		m1.findMissingNumber(arr);
	}
}

