package prcDecember;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {2,5,4,7,8,1,6};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int[] arr,int start, int end) {
		if(end<=start) {
			return;
		}
		int mid=(start+end)/2;
		sort(arr,start,mid);
		sort(arr,mid+1,end);
		merging(arr,start,mid,end);
	}
	public static void merging(int[] arr,int start,int mid, int end) {
		System.out.print(mid+" ");
		int[]myarr=new int[end-start+1];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<=arr[j]) {
				myarr[k]=arr[i];
				i++;
				k++;
			}
			else {
				myarr[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			myarr[k]=arr[i];
			i++;
			k++;
		}
		while(j<=end) {
			myarr[k]=arr[j];
			j++;
			k++;
		}
		for(int x=0;x<myarr.length;x++) {
			arr[start+x]=myarr[x];
		}
	}

}
