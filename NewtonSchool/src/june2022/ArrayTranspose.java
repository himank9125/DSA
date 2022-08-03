package june2022;

import java.util.Scanner;

public class ArrayTranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int[][] myArr=new int[X][Y];
		for(int i=0;i<myArr.length;i++) {
			for(int j=0;j<myArr[i].length;j++) {
				myArr[i][j]=sc.nextInt();
			}
		}
		int[][] transpose=resultArray(myArr);
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[0].length;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		


	}
	public static int[][] resultArray(int[][] arr){
		int[][] res=new int[arr[0].length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				res[j][i]=arr[i][j];
			}
		}
		return res;
	}

}



