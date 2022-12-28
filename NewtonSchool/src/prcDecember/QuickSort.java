package prcDecember;

public class QuickSort {

	public static void main(String[] args) {
		int[]arr= {4,8,5,2,9,4,6,7,14,51,47,12,47,15,1,6,25,58,};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int pvt=findPivote(arr, start,end);
		sort(arr,start,pvt-1);
		sort(arr,pvt+1,end);
	}
	public static int findPivote(int[] arr, int start, int end) {
		int j=start;
		for(int i=start;i<end;i++) {
			if(arr[i]<=arr[end]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		int temp=arr[end];
		arr[end]=arr[j];
		arr[j]=temp;
		return j;
	}

}
