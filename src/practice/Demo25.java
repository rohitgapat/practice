package practice;

public class Demo25 {

	public void findLCM(int arr[]) {
		int last = arr[arr.length-1];
		int oldLast=last;
		boolean flage=false;
		
		while(true) {
			for(int i=0;i<arr.length;i++) {
				flage=false;
				if(last%arr[i]==0) {
					flage=true;
				}
				
				else {
					break;
				}
			}
			
			if(flage==true) {
				System.out.println(last);
				break;
			}
			
			else {
				last=last+oldLast;
			}
		}
	}
	
	public static void main(String [] arg) {
		Demo25 d1= new Demo25();
		int arr[] = {5,10,15,20};
		d1.findLCM(arr);
	}
}
