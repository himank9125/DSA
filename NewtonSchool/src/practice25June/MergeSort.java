package practice25June;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,5,8,4,3,4,6,7,2,5,9};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	static void mergeSort(int[] arr, int start, int end) {
		int mid=(start+end)/2;
		if(start>=end) {
			return;
		}
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merging(arr,start,mid,end);
	}
	static void merging(int[]arr, int start,int mid, int end) {
		int[] myArr=new int[end-start+1];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				myArr[k]=arr[i];
				i++;
				k++;
			}
			else {
				myArr[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			myArr[k]=arr[i];
			i++;
			k++;
		}
		while(j<=end) {
			myArr[k]=arr[j];
			j++;
			k++;
		}
		int s=start;
		for(int x=0;x<myArr.length;x++) {
			arr[s]=myArr[x];
			s++;
		}
	}

}
