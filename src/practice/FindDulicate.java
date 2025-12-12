package practice;

public class FindDulicate {
	char dup []= new char [10];
	public void finddubbles(String name) {
		
		int index=0;
		int count =1;
		boolean flage = true;
		boolean check=true;
			
		char ele []= name.toCharArray();
		for (int i=0;i<ele.length;i++) {
			flage=true;
			count=0;
			for(int j=i+1;j<ele.length;j++) {
				if(ele[i]==ele[j]) {
					check=checkDuplicate(ele[i]);
					/* if(check==true) { */
						dup[index]=ele[i];
						index ++;
						count = count +1;
					//}
					
					flage=false;			
				}
			}
			
			if(flage==false) {
				System.out.println(ele[i]+" "+count);
			}
			
				if(flage==true) {
					check=checkDuplicate(ele[i]);
					if (check==true) {
						dup[index]=ele[i];
						index ++;	
						count=count+1;
						System.out.println(ele[i]+" "+count);
					}
					
				}
		}	
	}
	public boolean checkDuplicate(char ele) {
		boolean flage= false;
		for (int i=0;i<dup.length;i++) {
			if(dup[i]==ele) {
				return false;
				//break;	
			}
		}
		
		return true;
	}
	
	
	public static void main (String [] arg) {
		FindDulicate d1= new FindDulicate();
		d1.finddubbles("roheete");
	}
	
}
