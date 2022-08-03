package april.test;

public class RecursionRevereseNumber {

	public static void main(String[] args) {
		System.out.print(ReverseNumber(4582));
		// TODO Auto-generated method stub

	}
	public static int ReverseNumber(int n) {
		int result=0;
		int x=10;
		if(n==0) {
			return n;
		}
		int res=ReverseNumber(n/10);
		if(res>10) {
			int temp=res%10;
			result=result*10+temp;
			x*=10;
			res=res/10;
			
		}
		return x+result;
		
	}

}

// 4582
//458 2
//45 28
//4 285
//2854
//x=n%10;
//res=10*res+x

//25


