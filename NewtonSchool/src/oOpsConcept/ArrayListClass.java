package oOpsConcept;

import java.util.ArrayList;
import java.util.Scanner;

class HsClass{
	int roll;
	int name;
	int b;
	public HsClass(int roll, int name, int b) {
		this.roll=roll;
		this.name=name;
		this.b=b;
	}
}

public class ArrayListClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<HsClass> list=new ArrayList<>();
		//HsClass hs=new HsClass(232,"javed",true);
		//list.add(hs);
		for(int i=0;i<5;i++) {
			HsClass hs=new HsClass(sc.nextInt(),sc.nextInt(),sc.nextInt());
			list.add(i,hs);
		}
		for(int i=0;i<5;i++) {
			System.out.println(list.get(i).roll+"--->"+list.get(i).name+"----->"+list.get(i).b);
		}
	}

}
