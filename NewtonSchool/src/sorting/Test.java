package sorting;

public class Test {
	int x;
	final int y=20;
	public void fun(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InsertSort myObj=new InsertSort();
//		myObj.main(args);
		Test obj=new Test();
		obj.x=20;
		System.out.println(obj.x);
		obj.x=47;
		System.out.println(obj.x);
		obj.fun(20);
//		obj.y=5;   // Generation Error, coz of final keyword.
//		fun(10);   // Generating error due to public function(Non Static)
		
		
		class Student{
			private int roll;
			int age;
			String name;
			static String college="PTU";
			public void data(int r,int ag, String nm) {
				this.roll=r;
				this.age=ag;
				this.name=nm;
			}			
		}
		Student objn=new Student();
		Student S1=new Student();
		objn.roll=20;
		objn.age=30;
		System.out.println(objn.roll+" "+objn.age+" "+objn.college);
		objn.data(23,15,"mayank");
		S1.college="KPU";
		System.out.println(objn.roll+" "+objn.name+" "+S1.college);

	}

}
