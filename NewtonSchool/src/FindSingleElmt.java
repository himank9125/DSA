
public class FindSingleElmt {

	public static void main(String[] args) {
		int[] arr= {3,3,7,7,1,11,11};
		int x=FindSingleElementIdx(arr,0,arr.length-1);
		System.out.print(x);

	}
	public static int FindSingleElementIdx(int[] A, int s, int e) {
		if(s>=e) {
			return -1;
		}
		if(A.length==1) {
			return 0;
		}
		if(A[0]!=A[1]) {
			return 0;
		}
		if(A[A.length-1]!=A[A.length-2]) {
			return A.length-1;
		}
		int mid=(s+e)/2;
		if(A[mid]!=A[mid+1] && A[mid]!=A[mid-1] && (mid-1)>=0 && (mid+1)<=A.length-1) {
			return mid;
		}
		if(mid%2==0) {
			if(A[mid]==A[mid+1] && (mid+1)<=A.length-1) {
				return FindSingleElementIdx(A, mid+1,e);
			}
			else {
				return FindSingleElementIdx(A,s,mid-1);
			}
		}
		else {
			if(A[mid]==A[mid-1] && (mid-1)>=0) {
				return FindSingleElementIdx(A, mid+1,e);
			}
			else {
				return FindSingleElementIdx(A,s,mid-1);
			}
		}
	}

}
