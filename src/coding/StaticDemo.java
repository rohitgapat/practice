package coding;

public class StaticDemo {
	
	int stuId;
	String stuName;
	int rollNo;
	
	static String collegeName="KMJM";
	
	public static void Student() {
		System.out.println("print student static method");
		
	}
	
	public void superDemo() {
		System.out.println("method using super");
	}
	
	public StaticDemo() {
		
	}
	
	public StaticDemo(int stuId,String stuName, int rollNo) {
		this.stuId=stuId;
		this.stuName=stuName;
		this.rollNo=rollNo;
	}
	
	@Override
	public String toString() {
		return "StaticDemo [stuId=" + stuId + ", stuName=" + stuName + ", rollNo=" + rollNo + "]";
	}
	public static void main(String [] arg) {
		StaticDemo.Student();
		System.out.println(StaticDemo.collegeName);
	}
	
}	

