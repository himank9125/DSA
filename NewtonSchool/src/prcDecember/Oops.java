package prcDecember;
class Pen{
	String name;
	int price;
	void writing(){
		System.out.println(this.name);
	}
}

public class Oops {

	public static void main(String[] args) {
		Pen pp=new Pen();
		Pen pc=new Pen();
		pp.name="gel";
		pp.writing();
		pc.writing();
	}

}
