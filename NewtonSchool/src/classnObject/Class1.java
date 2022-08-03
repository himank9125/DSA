package classnObject;

 public class Class1 {
	int roll=20;
	String name="Mayank";
	boolean male=true;
	char section='A';
	public void result() {
		System.out.println(name+" "+roll);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Student extends Class1{
			String subject="English";
			float fee=(float) 2552.2;
			public void result1() {
				System.out.println(subject);
			}
	}
		Student S1=new Student();
		System.out.println(S1.subject);
		System.out.println(S1.name);
		S1.result();
		S1.result1();

}
	//Class1 cl=new Class1();
	
}
