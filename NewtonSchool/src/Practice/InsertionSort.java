package Practice;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,8,6,4,9,1,5,7,3,7,5,4,1,8,6,7,9,1,0};
		insertionSort(arr);
		int i=0;
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}

	}
	public static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int idx=i;
			for(int j=i;j>0;j--) {
				if(arr[j-1]>temp) {
					arr[j]=arr[j-1];
					idx--;
				}
			}
			arr[idx]=temp;		
		}
	}

}
