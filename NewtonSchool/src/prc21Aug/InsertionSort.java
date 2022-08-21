package prc21Aug;

public class InsertionSort {

	public static void main(String[] args) {
		int[]arr= {4,8,9,6,2,7,3,1};
		int[] x=sort(arr);
		for(int i:x) {
			System.out.print(i+" ");
		}
	}
	public static int[] sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
			
		}
		return arr;
	}

}
