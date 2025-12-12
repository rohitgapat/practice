package coding;

public class Employee {

	int id;
	String name;
	int salary;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return "id = "+id+" name = "+name+" salary = "+salary;
		
	}
	
}
