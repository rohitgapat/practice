package practice;

public class Demo43 {

	public void findMissing(int arr[]) {
		int first=arr[0];
		int last=arr[arr.length-1];
		boolean flag=false;
		
		for (int i=first;i<last;i++) {
			flag=false;
			for (int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag=true;
				}
			}
			
			if(flag==false) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] arg) {
		Demo43 d1 = new Demo43();
		int arr[]= {2,4,5,6,9};
		d1.findMissing(arr);
	}
}
