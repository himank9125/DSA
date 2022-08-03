package sorting;

public class buBBleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr= {4,2,6,8,7,5,9,3,7,2};
		bubbleSort(Arr);
		for(int i=0;i<Arr.length;i++) {
			System.out.print(Arr[i]+" ");
		}

	}
	public static void bubbleSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
