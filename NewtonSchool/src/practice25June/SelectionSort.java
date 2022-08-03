package practice25June;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,7,8,4,5,9,2,1,4,5,7,4,1};
		selectionSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
