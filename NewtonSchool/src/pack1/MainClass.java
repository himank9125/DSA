package pack1;

import pack2.P2Class;
class parent{
	String name;
	int age;
	char gender;
//	public parent(String name, int age) {
//		this.name=name;
//		this.age=age;
//	}
}
class child extends parent{
//	public child(String name, int age) {
//		super(name, age);
//	}
	public child(String prof,int salary,int level) {
		this.prof=prof;
		if(salary<10000) {
			this.salary=100*salary;
		}
		else {
		this.salary=salary;
		}
		this.level=level;
	}
	String prof;
	int salary;
	int level;
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2Class obj=new P2Class();
//		j.result();
		child obj1=new child("SDM",3200,11);
		obj1.name="Manish";
		obj1.prof="Student";
		System.out.print(obj1.prof+ " "+obj1.salary);

	}

}
