package practice;

public class Demo34 {

	public String binarySearch(int arr[], int num) {
		int first=0;
		
		int last=arr.length-1;
		
		for (int i=0;i<arr.length;i++) {
			int mid=(first+last)/2;
			if(arr[mid]==num) {
				return "Number is present at "+mid+" index";
				
			}
			
			else if(arr[mid]>num){
				last = mid-1;
			}
			
			else {
				first= mid+1;
			}
		}
		
		return "Number is not present";
	}
	
	public static void main (String [] arg) {
		Demo34 d1 = new Demo34();
		int arr[]= {23,45,55,62,78,84};
		System.out.println(d1.binarySearch(arr, 62));
	}
}
