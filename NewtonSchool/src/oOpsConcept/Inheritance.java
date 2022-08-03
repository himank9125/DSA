package oOpsConcept;
class Parent{
	String name="Naveen";
	public void print() {
		System.out.println("I am Parent");
	}
}
class Child extends Parent{
	String name="Manish";
	public void print() {
		System.out.println("I am Child");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Child ch=new Child();
		System.out.println(ch.name);
		ch.print();
		

	}

}
