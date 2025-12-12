package practice;

public class Demo38 {
	public String binarrySearch(int arr[], int num) {
		int first=0;
		int last=arr.length-1;
		
		for (int i=0;i<arr.length-1;i++) {
			int mid=(first+last)/2;
			if(arr[mid]==num) {
				return "number is present at "+mid+" index";
			}
			
			else if(num>arr[mid]) {
				first=mid+1;
			}
			
			else {
				last=mid-1;
			}
		}
		return "number is present";
	}
	
	public static void main(String [] arg) {
		Demo38 d1 = new Demo38();
		int arr[]= {12,34,45,56,67,89,92};
		System.out.println(d1.binarrySearch(arr, 45));
	}
}
