package classnObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class EmployeeDetails implements Comparable<EmployeeDetails>{
	int empId;
	String name;
	int age;
	int salary;
	public EmployeeDetails(int empId, String name,int age, int salary) {
		this.empId=empId;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	@Override
	public int compareTo(EmployeeDetails empl) {
		if(this.empId < empl.empId) {
			return -1;
		}
		else {
			return 1;
		}
		
	}
}
class empComparator implements Comparator<EmployeeDetails>{
	public int compare(EmployeeDetails e1, EmployeeDetails e2) {
		if(e1.salary != e2.salary) {
			if(e1.salary < e2.salary) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
//			System.out.println(e1.name.compareTo(e2.name));
//			return e1.name.compareTo(e2.name);
			if(e1.name.compareTo(e2.name) > 0) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<EmployeeDetails> list=new ArrayList<>();
		EmployeeDetails emp = new EmployeeDetails(121,"radha",31,1232);
		EmployeeDetails emp1 = new EmployeeDetails(122,"jayant",32,1300);
		EmployeeDetails emp2 = new EmployeeDetails(123,"madhu",32,1600);
		EmployeeDetails emp3 = new EmployeeDetails(125,"payank",32,1600);
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		empComparator empCompObj = new empComparator();
		Collections.sort(list , empCompObj);
		for(EmployeeDetails i:list) {
			System.out.println(i.empId+" "+i.name+" "+i.age+" "+i.salary);
		}
		

	}

}
