package practice25June;

import java.util.HashMap;
import java.util.Map;

public class MockInterview {

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3};
		result(arr,0,arr.length-1);

	}
	static void result(int[] arr, int start, int end) {
		if(start>end) {
			return;
		}
		int mid=(start+end)/2;
		if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) {
			System.out.print(arr[mid]);
		}
		result(arr,start, mid-1);
		result(arr,mid+1,end);
}
}
