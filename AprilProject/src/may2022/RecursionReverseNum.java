package may2022;

public class RecursionReverseNum {

	public static void main(String[] args) {
		int a=1000000;
		int x=9854785;
		System.out.print(reverseRec(x,a));
		// TODO Auto-generated method stub

	}
	public static int reverseRec(int n, int p) {
//		int y=n;
//		int result=0;
//		int count=1;
//		int temp;
//		if(n==0) {
//			return 0;
//		}
//		else {
//		temp=n%10;
//		while(y>10) {
//			count*=10;
//			y/=10;
//		}
//		result=(temp*count)+reverseRec(n/10);
//		return result;
//		}
		
		/*                                */
		if(n==0) {
			return 0;
		}
		else {
			int temp=n%10;
			int result=((temp*p)+reverseRec(n/10,p/10));
			return result;
		}
		
	}

}
