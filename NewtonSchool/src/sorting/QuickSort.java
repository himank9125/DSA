package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] A= {4,8,5,2,9,4,6,7,14,51,47,12,47,15,1,6,25,58,};
		quickSort(A,0,A.length-1);
		for(int i :A) {
			System.out.print(i+" ");
		}
		// TODO Auto-generated method stub

	}
	static void quickSort(int[] arr, int start, int end) {
		if(start>end) {
			return;
		}
		int pvtIdx=searchPvtIdx(arr,start,end);
		quickSort(arr,start,pvtIdx-1);
		quickSort(arr,pvtIdx+1,end);
	}
	static int searchPvtIdx(int[] arr,int start,int end) {
		int count=start;
		for(int i=start;i<end;i++) {
			if(arr[i]<=arr[end]) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
				
			}
		}
		int temp=arr[end];
		arr[end]=arr[count];
		arr[count]=temp;
		return count;
	}

}
