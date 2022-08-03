package Practice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,8,6,4,9,1,5,7,3};
		selectionSort(arr);
		int i=0;
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}
	}
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//int min=Integer.MAX_VALUE;
			int min=arr[i];
			int idx=i;
			for(int j=i;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					idx=j;
				}
			}
			int temp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
		}
	}
}
