package june2022;

import java.util.Scanner;

public class ReverseTheArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] myArr=new int[N];
		for(int i=0; i<N; i++) {
			myArr[i]=sc.nextInt();
		}
		int[] result=reverseArray(myArr,0,myArr.length-1);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		// TODO Auto-generated method stub

	}
	public static int[] reverseArray(int[] arr,int start,int end) {
		if(start>end) {
			return arr;
		}
		int temp=arr[end];
		arr[end]=arr[start];
		arr[start]=temp;
		return reverseArray(arr,start+1,end-1);
	}
	

}


