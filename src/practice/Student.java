package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

	 int rollNo;
	  String name;
	
	Student (int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	@Override
	public int compareTo(Student s) {
		
		return this.rollNo-s.rollNo;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	public static void main (String [] arg) {
		List <Student> l1= new ArrayList<>();
		l1.add (new Student(3,"Rohit"));
		l1.add(new Student(1, "Dipak"));
		l1.add(new Student(2, "Rohan"));
		Collections.sort(l1);
		System.out.println(l1);
	}
}
