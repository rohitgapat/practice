package practice;

public class Demo30 {

	public void findMissing(int arr[]) {
		int first = arr[0];
		int last = arr[arr.length-1];
		boolean flage=false;
		
		for(int i=first;i<=last;i++) {
			flage=false;		
			for (int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flage=true;
				}
			}
			
			if(flage==false) {
				System.out.println(i);
			}
		}	
	}
	
	public static void main(String [] arg) {
		Demo30 d1 = new Demo30();
		int [] arr= {2,4,6,7,9};
		d1.findMissing(arr);
	}
}
