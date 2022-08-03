import java.util.Arrays;

public class SarangArray {

	public static void main(String[] args) {
		int[] arr= {1,5,2,3,-4,-8,-3};
		System.out.print(result(arr));

	}
	static int result(int[] arr) {
//		Arrays.sort(arr);
		int sum=0;
		int sum2=0;
		int res=-1;
		int x=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=0) {
				x++;
			}
			else {
					sum+=arr[i];
//				if(arr[i]!=(i-x+1)) {
//					result=arr[i]-1;
//					return result;
//				}
				
			}
		}
		for(int i=1;i<=arr.length-x+1;i++) {
			sum2+=i;
		}
		res=sum2-sum;
		return res;
	}

}
