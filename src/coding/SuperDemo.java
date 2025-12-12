package coding;

public class SuperDemo {
	int empId;
	String empName;
	int empSalary;
	
	public SuperDemo() {
		System.out.println("parent default construtor");
		
	}
	
	public SuperDemo(int empId, String empName, int empSalary) {
		this();
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public void superDemo() {
		System.out.println("method call using super");
	}

	@Override
	public String toString() {
		return "SuperDemo [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
