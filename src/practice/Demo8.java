package practice;

public class Demo8 {

	public void checkNumIsPalendrome(int num) {
		int digit=0;
		int newNum=0;
		int oldNum=num;
		while(num!=0) {
			digit=num%10;
			num=num/10;
			newNum=(newNum*10)+digit;
		}
		System.out.println(newNum);
		if(oldNum==newNum) {
			System.out.println("is palendrome");
		}
		
		else {
			System.out.println("not palendrome");
		}
	}
	
	
	public void checkStringPalendrome(String name) {
		String newStr="";
		for (int i=name.length()-1;i>=0;i--) {
			char c= name.charAt(i);
			newStr=newStr+c;
		}
		System.out.println(newStr);
		if(name.equals(newStr)) {
			System.out.println("is palendrome");
		}
		else {
			System.out.println("not palendrome");
		}
	}
	public static void main(String [] arg) {
		Demo8 d1 = new Demo8();
		d1.checkNumIsPalendrome(34543);
		d1.checkStringPalendrome("rohor");
	}
}
