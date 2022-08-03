package practice25June;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,7,8,4,5,9,2,1,4,5,7,4,1};
		insertionSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int x=i;
			for(int j=i-1;j>=0;j--) {
				if(temp<arr[j]) {
					arr[j+1]=arr[j];
					x--;
				}
			}
			arr[x]=temp;
		}
	}

}
