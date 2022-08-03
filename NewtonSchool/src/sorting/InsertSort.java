package sorting;

public class InsertSort {

	public static void main(String[] args) {
		int[] A= {6,5,3,2,4,8,1,9,5,11,7,4,55,11,5,23,8,45,17,12,10,5,6,5,6,2,1};
		insertSortFun(A);
		//int[] result=insertSortFun(A);
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		// TODO Auto-generated method stub

	}
	public static int[] insertSortFun(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i;
			int temp=arr[j];
			while(j>0 && arr[j-1]>temp ) {
					arr[j]=arr[j-1];
					j--;
			}
			arr[j]=temp;
			}
		return arr;
	}

}
