package may2022;

import java.util.Scanner;

public class MedianProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
		int[] arr1= {1,3,7};
		int[] arr2= {2,3,4,5,6};
//		for(int i=0;i<n;i++){
//			arr1[i]=sc.nextInt();
//		}
//		for(int i=0;i<m;i++){
//			arr2[i]=sc.nextInt();
//		}
		//int[] res=new int[arr1.length+arr2.length];
		int[] res=newSortedArray(arr1,arr2);
//		for(int i=0;i<res.length;i++) {
//			System.out.println(res[i]);
//		}
		System.out.print(median(res));


	}
	public static int[] newSortedArray(int[] arr1, int[] arr2){
		int[] result=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<=arr2[j]){
				result[k]=arr1[i];
				i++;
				k++;
			}else{
				result[k]=arr2[j];
				j++;
				k++;

			}
		}
		while(j<arr2.length) {
				result[k]=arr2[j];
				k++;
				j++;
		}
		while(i<arr1.length){
				result[k]=arr1[i];
				k++;
				i++;			
		}
		return result;
	}
	public static float median(int[] myarray){
		if(myarray.length%2==0){
			return (myarray[myarray.length/2]+myarray[(myarray.length/2)-1])/2;	
		}
		else{
			return myarray[(myarray.length/2)];
		}
	}
}
