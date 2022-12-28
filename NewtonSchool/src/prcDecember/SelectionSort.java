package prcDecember;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {5,8,1,7,9,4,2,3};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int small=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[small]) {
					small=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[small];
			arr[small]=temp;
		}
	}

}
