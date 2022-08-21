package prc21Aug;

public class Merging {

	public static void main(String[] args) {
		int []A= {1, 3, 5, 8, 9};
		int[]B= {2,3,4,5,6,7};
		int[]C=merge(A,B);
		for(int i:C) {
			System.out.print(i+" ");
		}

	}
	public static int[] merge(int[]A, int []B) {
		int[] res=new int[A.length+B.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<A.length && j<B.length) {
			if(A[i]<B[j]) {
				res[k]=A[i];
				i++;
				k++;
			}
			else {
				res[k]=B[j];
				j++;
				k++;
			}
		}
		while(i<A.length) {
			res[k]=A[i];
			i++;
			k++;
		}
		while(j<B.length) {
			res[k]=B[j];
			j++;
			k++;
		}
		return res;
	}

}
