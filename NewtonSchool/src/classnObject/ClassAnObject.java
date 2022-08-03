package classnObject;

public class ClassAnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Student{
			private int roll;
			int age;
			String name;
			static String college="PTU";
			public Student(int r,int ag, String nm) {
				this.roll=r;
				this.age=ag;
				this.name=nm;
			}		
		}
//		Student objn=new Student();
//		objn.roll=20;
//		objn.age=30;
//		System.out.println(objn.roll+" "+objn.age+" "+objn.college);
//		objn.data(23,15,"mayank");

		Student S1=new Student(121,25,"naveen");
		System.out.println(S1.roll+" "+S1.name+" "+S1.college);
		S1.college="KPU";
		S1.roll=32;
		S1.name="manish";
		Student.college="jnu";
		System.out.println(S1.roll+" "+S1.name+" "+S1.college);


	}

}
