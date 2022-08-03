package prc13jul;

public class PrcArr {

	public static void main(String[] args) {
		PrcArr arrobj=new PrcArr();
		int[]arr= {1,2,3,4,5,6,7,8};
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[]res=arrobj.reverse(arr);
		for(int i:res) {
			System.out.print(i+" ");
		}

	}
	public int[] reverse(int[]arr) {
		int[]A=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			A[arr.length-i-1]=arr[i];
		}
		return A;
	}

}
