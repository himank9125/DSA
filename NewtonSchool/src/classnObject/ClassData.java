package classnObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class teacher implements Comparable<teacher>{
	int id;
	int age;
	String name;
	char gender;
	public teacher(int id,int age,String name,char gender) {
		this.id=id;
		this.age=age;
		this.name=name;
		this.gender=gender;
	}
	@Override
	public int compareTo(teacher tc) {
		if(this.age<tc.age) {
			return -1;
		}
		if(this.age>tc.age) {
			return 1;
		}
		else{
			return 0;
		}
//		return this.age-tc.age;
	}
}

public class ClassData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<teacher> list=new ArrayList<>();
		teacher tc1=new teacher(55,32,"mayank",'M');
		teacher tc2=new teacher(123,44,"manish",'F');
		teacher tc3=new teacher(515,12,"bhanu",'M');
		teacher tc4=new teacher(551,28,"ankur",'F');
		teacher tc5=new teacher(255,32,"jayant",'M');
		list.add(tc1);
		list.add(tc2);
		list.add(tc3);
		list.add(tc4);
		list.add(tc5);
		Collections.sort(list);
		for(teacher x:list) {
			System.out.println(x.id+" "+x.name+" "+x.gender+" "+x.age);
		}
		

	}

}
