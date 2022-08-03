
public class MergeSorted {

	public static void main(String[] args) {
		int[] a = {1, 4, 7, 9, 11, 16, 23};
		int[] b = {5, 8, 15, 19};
//		int[] result=merged(a,b);
//		for(int i:result) {
//			System.out.print(i+" ");
//		}

	}
	static int[] merged(int[]A, int[] B) {
		int[]C=new int[A.length+B.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<A.length && j<B.length) {
			if(A[i]<B[j]) {
				C[k]=A[i];
				i++;
				k++;
			}
			else {
				C[k]=B[j];
				j++;
				k++;
			}
		}
		while(i<A.length) {
			C[k]=A[i];
			i++;
			k++;
		}
		while(j<B.length) {
			C[k]=B[j];
			j++;
			k++;
			
		}
		return C;
	}

}
