package practice;

public class Demo42 {

	public void findLCM(int arr[]) {
		int high=arr[arr.length-1];
		int oldHigh=high;
		boolean flage = false;
	
		while(true) {
			for (int i=0;i<arr.length;i++) {
				flage=false;
				if(high%arr[i]!=0) {
					flage=true;
					break;
				}
			}
			
			if(flage==false) {
				System.out.println(high);
				break;
			}
			else {
				high=high+oldHigh;
			}
		}
	}
	
	public static void main (String arg[]) {
		Demo42  d1 = new Demo42();
		int arr[] = {5,10,15,75};
		d1.findLCM(arr);
	}
}
