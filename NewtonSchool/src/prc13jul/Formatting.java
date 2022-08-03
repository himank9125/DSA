package prc13jul;

import java.util.Scanner;

public class Formatting {

	public static void main(String[] args) {
//		int x=20;
//		float y=12;
//		double z=12.4574512584;
//		String s="Welcome to Newton School";
//		boolean b=true;
//		System.out.printf("My integer is %s and the float is %f wheras double id %f%n , String is %s",x,y,z,s);
//		System.out.println();
//		System.out.printf("Captal String is %S and Capital Bool is %B",s,b);
//		System.out.println();
//		System.out.printf("Small String is %s, and Small Biil is %b%n",s,b);
//		System.out.printf("%25.5s%n",s);
//		System.out.printf("%.2s%n",s);
//		System.out.printf("'%25S'",s);
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(true) {
			String aa=sc.nextLine();
			System.out.printf("%d %s%n",i,aa);
			i++;
			if(!sc.hasNext()) {
				break;
			}
		}
	}

}
