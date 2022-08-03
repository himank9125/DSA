
public class Practice26june {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Bubble Sort
		int[] arr= {1,5,4,1,2,6,3,8,4,9};
		sortedArray(arr);
		for(int i:arr) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void sortedArray(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
