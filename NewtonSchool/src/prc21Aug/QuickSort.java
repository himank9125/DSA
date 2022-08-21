package prc21Aug;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {2,8,4,5,1,3,4,9,5,1};
		sort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	public static void sort(int [] arr,int start, int end) {
		if(start>end) {
			return;
		}
		int val=saperator(arr,start,end);
		sort(arr,start,val-1);
		sort(arr,val+1,end);
	}
	public static int saperator(int[] arr, int start, int end) {
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
