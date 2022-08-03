import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		result(arr,K);
		}

	}
	
	static void result(int[] A, int K){
		int x=0;
		for(int i=1;i<A.length;i++){
			x+=i;
		}
		int[] arr1=new int[x];
		int num=0;
		for(int j=0;j<A.length;j++){
			for(int k=j+1;k<A.length;k++){
				arr1[num]=Math.abs(A[j]-A[k]);
				num++;
			}
		}
		Arrays.sort(arr1);
		System.out.print(arr1[K-1]);
	}

}
