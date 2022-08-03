//
package classnObject;

public class Class2 {
	private int ssn=1235214;
	private String name="Manish";
	private char gender='M';
	private int age =10;
	//Getter
	public void setSsn(int ssn) {
		this.ssn=ssn;
	}
	//Setter
	public int getSsn() {
		return ssn;
	}
	public void setAge(int age) {
		if(age<0) {
			this.age=0;
		}
		else {
		this.age=age;
		}
	}
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student myObj=new Student();
		
		
//		Class2 obj=new Class2();
//		System.out.println(obj.ssn);
//		obj.ssn=254158;
//		System.out.println(obj.ssn);
//		obj.setSsn(854123);
//		System.out.println(obj.getSsn());
//		obj.setAge(-10);
//		System.out.print(obj.getAge());
//		Class1 cls=new Class1();
//		System.out.println(cls.roll);
		
		

	}
	

}

