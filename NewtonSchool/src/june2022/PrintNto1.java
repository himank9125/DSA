package june2022;

import java.util.Scanner;

public class PrintNto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		result(Num);

	}
	public static int result(int N) {
		if(N<1) {
			return 0;
		}
		System.out.print(N+" ");
		return result(N-1);
	}

}
