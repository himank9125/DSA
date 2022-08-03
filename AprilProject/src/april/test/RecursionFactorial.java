package april.test;

public class RecursionFactorial {

	public static void main(String[] args) {
		
		System.out.print(FactRec(3));
		// TODO Auto-generated method stub

	}
	public static int FactRec(int n) {
		if(n==1) {
			return 1;
		}
		int res=FactRec(n-1);
		int result=n*res;
		return result;
	}

}
