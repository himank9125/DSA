package june2022;

import java.util.Scanner;

public class ArraySumOfRowsElm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[][] newtonArray=new int[N][M];
		int[] sumResult=new int[newtonArray[0].length];
		for(int i=0;i<newtonArray.length;i++) {
			for(int j=0;j<newtonArray[0].length;j++) {
				newtonArray[i][j]=sc.nextInt();
				sumResult[j]=sumResult[j]+newtonArray[i][j];
			}
		}
		
		for(int i=0;i<newtonArray[0].length;i++) {
				System.out.printf(sumResult[i]+" ");
		}
		

	}

}
