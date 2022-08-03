package may2022;

public class CyclicBinarySearch {

	public static void main(String[] args) {
		int[] myarr= {2,3,4,5,6,7,8};
		int x=6;
		System.out.print(cycliCBinarySearch(myarr,x));
		// TODO Auto-generated method stub

	}
	public static int cycliCBinarySearch(int [] arr, int elm) {
		int PivoteIndex=finDPioteIndex(arr,0,(arr.length-1));
		int leftSearch=binarySearch(arr,elm,0,(PivoteIndex-1));
		if(leftSearch!=-1) {
			return leftSearch;
		}
		else {
		return binarySearch(arr,elm,(PivoteIndex+1),(arr.length-1));
		}
	}
	public static int finDPioteIndex(int[] arr,int start, int end) {
		int mid=(start+end)/2;
		if(start>end) {
			return -1;
		}
		if(start==end) {
			return start;
		}
		if(arr[mid]>arr[mid+1] && end>=(mid+1)) {
			return mid;
		}
		if(arr[mid]<arr[mid-1] && start<=(mid-1)){
			return mid+1;
		}
		if(arr[mid]>arr[start]) {
			return finDPioteIndex(arr,(mid+1),end);
		}
		else{
			return finDPioteIndex(arr, start, (mid-1));
		}
		
	}
	public static int binarySearch(int[] arr, int elm, int start,int end) {
		if(start>end) {
			return -1;
		}
		if(start==end) {
			return start;
		}
		int mid=(start+end)/2;
		if(arr[mid]>elm) {
			return binarySearch(arr,elm,start,(mid-1));
		}
		else if (arr[mid]<elm){
			return binarySearch(arr,elm,(mid+1),end);
		}
		else {
			return mid;
		}
	}

}
