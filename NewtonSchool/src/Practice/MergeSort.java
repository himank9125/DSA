package Practice;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,8,6,4,9,1,5,7,3,7,5,4,1,8,6,7,9,1,0};
		mergeSort(arr,0,arr.length-1);
		int i=0;
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}

	}
	public static void mergeSort(int[] arr, int start, int end) {
		int mid=(end+start)/2;
		if(start>=end) {
			return;
		}
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		twoSortedArraySort(arr,start,mid,end);
	}
	public static void twoSortedArraySort(int[] A,int s,int m,int e) {
		int[]B=new int[e-s+1];
		int i=s;
		int j=m+1;
		int k=0;
		while(i<=m  && j<=e) {
			if(A[i]<=A[j]) {
				B[k]=A[i];
				k++;
				i++;
			}
			else {
				B[k]=A[j];
				k++;
				j++;
			}
		}
		while(i<=m) {
			B[k]=A[i];
			k++;
			i++;
		}
		while(j<=e) {
			B[k]=A[j];
			k++;
			j++;
		}
		int idx=s;
		for(int x=0;x<B.length;x++) {
			A[idx]=B[x];
			idx++;
		}
	}

}
