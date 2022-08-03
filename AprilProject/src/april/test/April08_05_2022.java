package april.test;

import java.util.Scanner;

public class April08_05_2022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Closest(x);

	}
	
	public static void Closest(int N){
		for (int i=3;i<=N;i++){
			for(int j=2;j>i;j--){
				if(i%j==0){
					System.out.print(i+ "is a non prime");
				}
				else{
					System.out.print(i+ "is a prime");
				}

			}
		}
	}

}
