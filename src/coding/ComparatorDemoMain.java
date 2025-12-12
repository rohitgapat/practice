package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeSortByName implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}	

class EmployeeSortById implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.id-e2.id;
	}
}

public class ComparatorDemoMain {
	public static void main (String [] arg) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(4,"Manaj",60000));
		list.add(new Employee(3,"Yogesh",85000));
		list.add(new Employee(1,"Suraj",80000));
		list.add(new Employee(2,"Rohit",75000));

		Collections.sort(list, new EmployeeSortById());

		for(Employee e : list){
			System.out.println(e);
		}
	}
}

