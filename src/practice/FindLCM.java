package practice;

public class FindLCM {

	public void calculateLCM(int arr[]) {
		int high=arr[arr.length-1];
		int oldHigh=high;
		boolean flage=true;
		
		while(true) {
			for (int i=0;i<arr.length;i++) {
				flage =true;
				if(high%arr[i]==0) {
					flage=false;
				}
				
				else {
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
		FindLCM f1 = new FindLCM();
		int arr[] = {5,10,15,30,50};
		f1.calculateLCM(arr);
	}
}
