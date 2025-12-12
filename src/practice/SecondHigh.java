package practice;

public class SecondHigh {

	public void findSecondHigh(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int x=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;				
				}
			}
		}
		
		System.out.println(arr[arr.length-2]);
	}
	
	public static void main (String [] arg) {
		SecondHigh s1 = new SecondHigh();
		int arr[]= {19,12,45,67};
		s1.findSecondHigh(arr);
				
	}
}
