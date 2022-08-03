package april.test;

import java.util.Scanner;

public class April06_05_2022_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
//		FibSeries(T);
		Series(T);
		
		
	}
	public static void FibSeries(int x) {
		int sum1=0;
		int sum2=1;
		if (x==0 || x==1) {
			System.out.print(x);
		}
		else {
		for (int i=1;i<x;i++) {
			int sum3=sum1+sum2;
			sum1=sum2;
			sum2=sum3;			
		}
		System.out.print(sum2);
	}
	}
	public static void Series(int N) {
		for(int i=2;i<=N;i++) {
			if(i*2>N) {
				System.out.print(i+" ");
			}
		}
	}

}
