package april.test;

import java.util.Scanner;

public class April10_05_2022 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		CheckPrime(x);
		// TODO Auto-generated method stub

	}
	
	public static void CheckPrime(int N){
		int flag=0;
		int m=N/2;
		if(N<2){
			System.out.print("NO");
		}
		else{
			
			
		for(int i=2; i<m; i++)
		{
			if(N%i==0)
			{
				System.out.print("NO");
				flag=1;
				break;
			}			
		}		
	}
		if(flag==0)
		{
			System.out.print("YES");
		}
		
	}

}
