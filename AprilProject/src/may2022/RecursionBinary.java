package may2022;

public class RecursionBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(binaryRec(5));

	}
	public static int binaryRec(int n) {
		int result=0;
		if(n<2) {
			result=n%2;
			return result;
		}
		int x=(result*10)+binaryRec(n/2);
		return x;
	}

}
