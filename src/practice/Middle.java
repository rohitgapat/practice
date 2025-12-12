package practice;

public class Middle {

	public void findMiddleIndex(int arr[],int arr2[]) {
		int len1=arr.length;
		int len2=arr2.length;
		int sum=len1+len2;
		int newArray[]= new int [sum];
		int index=0;
		for (int i=0;i<arr.length;i++) {
			newArray[index]=arr[i];
			index++;
		}
		
		for (int i=0;i<arr2.length;i++) {
			newArray[index]= arr2[i];
			
			index++;
		}
		int mid=sum/2;
		if(newArray.length%2==0) {
			
			System.out.println(newArray[mid]+" "+newArray[mid-1]);
			float middle=(float) (newArray[mid]+newArray[mid-1])/2;
			System.out.println(middle);
		}
		else {
			System.out.println(newArray[mid]);
		}
		
		
	}
	
	public static  void main(String [] arg) {
		Middle m1= new Middle();
		int arr1[]= {4,5,6};
		int arr2[]= {7,8,9,10};
		
		m1.findMiddleIndex(arr1, arr2);
	}
}
