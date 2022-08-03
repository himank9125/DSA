package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr= {5,8,2,4,9,6,1,2,7,5};
		selectionSort(myArr);
		for(int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}

	}
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int temp=Integer.MAX_VALUE;
			int idx =-1;
			for(int j=i;j<arr.length;j++) {
				if(temp>arr[j]) {
					temp=arr[j];
					idx=j;
				}
			}
			swapping(arr,i,idx);
		}
	}
	public static void swapping(int[] arr,int A, int B) {
		int temp=arr[A];
		arr[A]=arr[B];
		arr[B]=temp;
	}

}
