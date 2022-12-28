package prcDecember;

public class Mergearray {

	public static void main(String[] args) {
		int[] A= {1,3,5,7,9};
		int[]B= {2,4,6,8};
		int[] arr=new int[A.length+B.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<A.length && j<B.length) {
			if(A[i]<=B[j]) {
				arr[k]=A[i];
				i++;
				k++;
			}
			else {
				arr[k]=B[j];
				j++;
				k++;
			}
		}
		while(i<A.length) {
			arr[k]=A[i];
			i++;
			k++;
		}
		while(j<B.length) {
			arr[k]=B[j];			
			j++;
			k++;
		}
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
	}

}
