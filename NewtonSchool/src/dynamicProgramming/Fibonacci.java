package dynamicProgramming;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int[] arr= {10,9,8,3,4,5,6,7};
		System.out.println(pivot(arr,0,arr.length-1));
	}
	public static int pivot(int[]arr, int start, int end) {
//		if(start>end) {
//			return -1;
//		}
		if(start==end){
			return start;
		}
		int mid=(start+end)/2;
		if(arr[mid]>arr[mid+1] && mid+1<=end) {
			return mid;
		}
		else if(arr[mid]<arr[mid-1] && mid-1>=start) {
			return mid-1;
		}
		if(arr[start]>arr[mid]) {
			return pivot(arr,start,mid-1);
		}
		else {
			return pivot(arr,mid+1,end);
		}
	}
}
