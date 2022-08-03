package may2022;

import java.util.Scanner;

public class BuildingProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] myArr=new int[N];
		for(int i=0;i<N;i++){
			myArr[i]=sc.nextInt();
		}
		System.out.print(numberOfBuild(myArr));
        
		// TODO Auto-generated method stub

	}
	public static int numberOfBuild(int[] arr){
		int count=0;
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<=arr[i]){
				max=arr[i];
				count++;
			}
			
		}
		return count;
	}
}
