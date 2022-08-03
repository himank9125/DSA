package april.test;

import java.util.Scanner;

public class April06_05_2022 {

	public static void main(String[] args) {
		int[] Myarr= {1,2,3,4,5,6,7,8,9,0,4,5,6,7,8};
		Scanner sc=new Scanner(System.in);
		int Point=sc.nextInt();
		ReverseValue(Myarr,Point);
		
		// TODO Auto-generated method stub

	}
	
public static void ReverseValue(int[] arr,int Ptr) {
	
	int temp=arr[arr.length-1];
	for(int i=arr.length-1;i>=Ptr;i--) {
			arr[i]=arr[i-1];	
	}
//	arr[Ptr]=temp;
//	temp=arr[Ptr-1];
//	for (int i=Ptr-2;i>0;i--) {
//		arr[i]=arr[i-1];
//	}
	arr[0]=temp;	
	for(int i=0;i<arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
