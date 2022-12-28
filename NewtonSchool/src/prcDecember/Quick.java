package prcDecember;

public class Quick {

	public static void main(String[] args) {
		int[] arr= {2,7,4,1,6,1,2,4,3};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int pvt=fintPivote(arr,start,end);
		sort(arr,start,pvt-1);
		sort(arr,pvt+1,end);
	}
	public static int fintPivote(int[] arr, int start, int end) {
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
