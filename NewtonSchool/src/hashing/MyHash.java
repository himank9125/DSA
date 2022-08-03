package hashing;

public class MyHash {

	public static void main(String[] args) {
		int[] A= {4,5,6,7,2,3};
		result(A,0,A.length-1);
		// TODO Auto-generated method stub

	}
	public static void result(int[] arr,int start, int end){
		int mid=(start+end)/2;
		if(start<end){
			result(arr, start, mid);
			result(arr, mid, end);
		}
		if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
			System.out.print("Yes");
			return;
		}
		else{
			System.out.print("No");
			return;
		}
		
	}

}
