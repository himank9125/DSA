package prc21Aug;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {4,5,7,1,8,2,4,9,5,3,1,6,4,14,19,15,18,22};
		mergeSort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void mergeSort(int[] arr,int start, int end) {
		int mid=(start+end)/2;
		if(start>=end) {
			return;
		}
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merging(arr,start,mid,end);
	}
	
	public static void merging(int[] arr,int start,int mid,int end) {
		int[]res=new int[end-start+1];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				res[k]=arr[i];
				i++;
				k++;
			}
			else {
				res[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			res[k]=arr[i];
			i++;
			k++;
		}
		while(j<=end) {
			res[k]=arr[j];
			j++;
			k++;
		}
		int p=start;
		for(int m=0;m<res.length;m++) {
			arr[p]=res[m];
			p++;
		}
	}

}
