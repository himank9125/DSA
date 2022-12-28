package prcDecember;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {8,1,4,9,5,3,7,4,5,2,1,9,5,4,7,8,6,2,3,5,4};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		
	}

}
