package prc04sep;

public class Moc {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,7,9,11};
		System.out.println(binarySearch(arr,0,arr.length-1,13));

	}
	public static int binarySearch(int[] arr, int start, int end, int k) {
		if(start>end) {
			return -1;
		}
		int mid=(start+end)/2;
		if(k<arr[mid]) {
			return binarySearch(arr,start,mid-1,k);
		}
		else if(k>arr[mid]) {
			return binarySearch(arr, mid+1, end,k);
		}
		else {
			return mid;
		}
		
	}
}
