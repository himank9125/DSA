package array;

public class RotatedArray {

	public static void main(String[] args) {
		int[] arr= {4,5,6,7};
		int k=5;
		int point =rotation(arr,0,arr.length-1);
		System.out.println(point);
		int index;
		if(k>arr[point]) {
			index=binarySearch(arr,0,point-1,k);
		}
		else if(k<arr[point]){
			index=binarySearch(arr,point+1,arr.length-1,k);
		}
		else {
			index=point;
		}
		System.out.print(index);
	}
	public static int rotation(int[] arr, int start, int end) {
		if(start>=end) {
			return end;
		}
		int mid=(start+end)/2;
		if(arr[mid]>arr[mid+1]) {
			return mid;
		}
		if(arr[mid]>arr[start]) {
			return rotation(arr,mid+1,end);
		}
		if(arr[mid]<arr[start]) {
			return rotation(arr, start, mid-1);
		}
		return end;
	}
	public static int binarySearch(int[] arr, int start, int end, int k) {
		if(start>=end) {
			return -1;
		}
		int mid=(start+end)/2;
		if(k<arr[mid]) {
			return binarySearch(arr, start,mid-1, k);
		}
		else if(k>arr[mid]) {
			return binarySearch(arr, mid+1,end, k);
		}
		else {
			return mid;
		}
		
	}
	 

}
