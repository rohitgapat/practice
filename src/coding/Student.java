package coding;

public class Student implements Comparable<Student> {

	int id;
	String name;
	int marks;
	
	public Student() {
		
	}
	
	public Student(int id,String name, int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
	
	public String toString() {
		return id+" "+name+" "+marks;
	}
}
