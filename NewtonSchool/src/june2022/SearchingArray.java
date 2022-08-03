package june2022;

import java.util.Scanner;

public class SearchingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//int N=sc.nextInt();
		int elm=0;
		int[] arr= {1,2,3,4,5,6,7,8,9};
//		for(int i =0;i<N;i++) {
//			arr[i]=sc.nextInt();
//		}
		
		System.out.print(searchBinary(arr,elm,0,arr.length-1));
		/*
		 * 1 5 7 8 9 11 15
		 */
		

	}
	public static int searchBinary(int[] myarr,int num, int start, int end) {
		int mid=(start+end)/2;
		if(start>end) {
			return -1;
		}
		if(num==myarr[mid]) {
			return mid;
		}
		else if(num>myarr[mid]) {
			return searchBinary(myarr,num,mid+1,end);
		}
		//if(num<myarr[mid]) {
			return searchBinary(myarr,num,start,mid-1);
		//}
		//return false;
		
	}

}
