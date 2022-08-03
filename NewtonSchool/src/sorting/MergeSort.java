package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,5,8,4,3,4,6,7,2,5,9};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void mergeSort(int[] Arr,int start,int end) {
		int mid=(end+start)/2;
		if(start>=end) {
			return;
		}
		mergeSort(Arr,start,mid);
		mergeSort(Arr,mid+1,end);
		merging(Arr,start,mid,end);
		
	}
	public static void merging(int[] Arr,int s, int mid, int e) {
		int[]myArr=new int[e-s+1];
		int idx=0;
		int i=s;
		int j=mid+1;
		while(i<=mid && j<=e) {
			if(Arr[i]<=Arr[j]) {
				myArr[idx]=Arr[i];
				i++;
				idx++;
			}
			else {
				myArr[idx]=Arr[j];
				j++;
				idx++;
			}
		}
		while(i<=mid) {
			myArr[idx]=Arr[i];
			i++;
			idx++;
		}
		while(j<=e) {
			myArr[idx]=Arr[j];
			j++;
			idx++;
		}
		int idxx=s;
		for(int x=0;x<myArr.length;x++) {
			Arr[idxx]=myArr[x];
			idxx++;
		}
	}

}
