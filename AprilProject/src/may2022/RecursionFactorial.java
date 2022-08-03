package may2022;

public class RecursionFactorial {

	public static void main(String[] args) {
		System.out.print(recFactorial(3));
		// TODO Auto-generated method stub

	}
	public static int recFactorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*recFactorial(n-1);
		}
	}

}
