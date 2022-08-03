package oOpsConcept;
class Student{
	int id;
	String name;
	
	//Creating 3 methods with same name
	//This is polymorphism , compile time method overloading;
	
	public void printInfo(int id) {
		System.out.println("Student ID is "+ id);
	}
	public void printInfo(String id) {
		System.out.println("Student ID is "+ id);
	}
	public void printInfo() {
		System.out.println("Student ID is "+ this.id+" and Student name is "+this.name);
	}
}
public class PolyMorphism {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=2515;
		s1.name="Manish";
		s1.printInfo(2514);
		s1.printInfo();
		s1.printInfo("Mayank");

	}

}
