package oOpsConcept;

import java.util.ArrayList;
import java.util.Scanner;

class gen<Y, Z>{
	int x;
	Y y;
	Z z;
	public gen(int x,Y y, Z z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
}

public class Generics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
	ArrayList<gen> arr=new ArrayList<>();
	for(int i=0;i<3;i++) {
		int a=sc.nextInt();
		Integer b=sc.nextInt();
		Integer c=sc.nextInt();
		gen<Integer, Integer> genObj=new gen(a,b,c);
		arr.add(genObj);
	}
	for(int i=0;i<3;i++) {
		int p=arr.get(i).x;
		System.out.println(arr.get(i).x+" "+arr.get(i).y+" "+arr.get(i).z);
	}


	}

}
