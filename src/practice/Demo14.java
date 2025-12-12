package practice;

public class Demo14 {

	public void findLCM(int arr[]) {
		int high=arr[arr.length-1];
		int oldHigh=high;
		boolean flage=true;
		
		while(true) {
			
			for (int i=0;i<arr.length;i++) {
				flage=true;
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
	
	public static void main(String [] arg) {
		Demo14 d1 = new Demo14();
		int arr[]= {5,15,20,45};
		d1.findLCM(arr);
	}
}
