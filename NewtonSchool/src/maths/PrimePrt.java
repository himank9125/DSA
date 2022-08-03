package maths;

public class PrimePrt {

	public static void main(String[] args) {
		// 0-50;
		int x=10000000;
		int[] A=new int[x+1];
		for(int i=2;i<Math.sqrt(x);i++) {
			if(A[i]==0) {
				for(int j=i*2;j<=x;j+=i) {
					A[j]=1;
				}
			}
		}
		int count=0;
		for(int i=10;i<=x;i++) {
			if(A[i]==0) {
				//System.out.print(i+", ");
				count++;
			}
		}
		System.out.println();
		System.out.print(count);
	}

}
