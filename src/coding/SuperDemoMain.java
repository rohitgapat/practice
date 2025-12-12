package coding;

public class SuperDemoMain extends SuperDemo {
	
	int stuId;
	int marks;
		
	public SuperDemoMain() {
		//super();
		super(5,"rohit",40000);
		super.superDemo();
	}
	
	public SuperDemoMain (int stuId,int marks) {
		super();
		this.stuId=stuId;
		this.marks=marks;
	}
	
	public void callParentMethod() {
		super.superDemo();
	}

	public static void main(String [] arg) {
		SuperDemoMain d1 = new SuperDemoMain();
		System.out.println(d1);
	}
}
