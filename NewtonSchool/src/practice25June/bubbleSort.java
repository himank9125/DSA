package practice25June;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,7,8,4,5,9,2,1,4,5,7,4,1};
		bubbleSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {		
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
