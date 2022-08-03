package sorting;

public class Merge2SortedArray {

	public static void main(String[] args) {
		int[] arr1= {4,6,7,8,9,12,18,25};
		int[] arr2= {1,2,2,5,6,7};
		result(arr1,arr2);


	}
	public static void result(int[] A,int[] B) {
		int[]myArr=new int[A.length+B.length];
		int idx=0;
		int i=0;
		int j=0;
		while(i<A.length && j<B.length) {
			if (A[i]<=B[j]) {
				myArr[idx]=A[i];
				i++;
				idx++;
			}
			else {
				myArr[idx]=B[j];
				j++;
				idx++;
			}
		}
		while(i<A.length) {
			myArr[idx]=A[i];
			i++;
			idx++;
		}
		while(j<B.length) {
			myArr[idx]=B[j];
			j++;
			idx++;
		}
		for(int x=0;x<myArr.length;x++) {
			System.out.print(myArr[x]+" ");
		}
	}


}
