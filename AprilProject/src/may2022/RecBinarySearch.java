package may2022;

import java.util.Scanner;

public class RecBinarySearch {
	public static void main(String[] args) {
		/*
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int x=sc.nextInt();
		int[] SoArray=new int[N];
		for(int i=0;i<N;i++) {
			SoArray[i]=sc.nextInt();
		}
		*/
		int[] ReadyArray= {2,5,7,9,11,15,18,22,45,49,52,54,59,62,68};
		int x=68;
		System.out.print(reCBinarySearch(ReadyArray,x,0,ReadyArray.length-1));
		
	}
	
	public static Boolean reCBinarySearch(int[] myarr, int elm, int start, int end) {
		int mid=(start+end)/2;
		if(start>end) {
			return false;
		}
		if(elm>myarr[mid]) {
			return reCBinarySearch(myarr,elm,mid+1,end);
		}
		else if(elm<myarr[mid]) {
			return reCBinarySearch(myarr,elm,start,mid-1);
		}
		else {
			return true;
		}
	}

}
