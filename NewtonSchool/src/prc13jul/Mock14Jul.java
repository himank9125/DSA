package prc13jul;

import java.util.Scanner;

public class Mock14Jul {
	
	static Scanner sc=new Scanner(System.in);
	static int m = sc.nextInt();
	static int n = sc.nextInt();
	static boolean flag=false;
	static {
	if(m*n>0) {
		flag=true;
	}
	else {
	System.out.println("Not Valid");
	}
	}
	public static void main(String[] args) {
		if(flag) {
			System.out.print(n*m);
		}
		

	}

}
