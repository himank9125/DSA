package Practice;

public class BubbleSort {

	public static void main(String[] args) {
	int[] arr= {2,8,6,4,9,1,5,7,3};
	bubbleSort(arr);
	int i=0;
	while(i<arr.length) {
		System.out.print(arr[i]+" ");
		i++;
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
