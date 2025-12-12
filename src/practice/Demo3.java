package practice;

public class Demo3 {

	public void findLCM(int arr[]) {
		int high=arr[arr.length-1];
		int oldHigh=high; 
		boolean flage=false;
		
		while(true) {
			for (int i=0;i<arr.length;i++) {
				flage=false;
				if(high%arr[i]==0) {
					flage=true;
				}
				else {
					break;
				}
			}
			
			if(flage==true) {
				System.out.println(high);
				break;
			}
			
			else {
				high=high+oldHigh;
			}
		}
	}
	
	
	public static void main (String [] arg) {
		Demo3 d1= new Demo3();
		int arr[]= {5,10,30,45};
		d1.findLCM(arr);
	}
}
