package practice;

public class Demo36 {

	public void findLCM (int arr[]) {
		int high=arr[arr.length-1];
		int oldHigh=high;
		boolean flage =false;
		
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
			if(flage==false) {
				high=high+oldHigh;
			}
			else {
				System.out.println(high);
				break;
			}
		}
	}
	
	public static void main(String arg [] ) {
		Demo36 d1= new Demo36();
		int arr[]= {5,8,15,25};
		d1.findLCM(arr);
	}
}
