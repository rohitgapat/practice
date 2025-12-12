package coding;

import java.io.Serializable;

public class EmployeeDemo implements Serializable{

	int id;
	String name;
	float salary;
	
	public EmployeeDemo() {
		
	}
	
	public EmployeeDemo(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return id+" "+name+" "+salary;
	}
}
