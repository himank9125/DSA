package may2022;

public class RecursionPower {

	public static void main(String[] args) {
		int a=5;
		int b=4;
		System.out.print(powerRec(a,b));
		// TODO Auto-generated method stub

	}
	public static int powerRec(int x, int n) {
		if(n==0) {
			return 1;
		}
		else if(x==0) {
			return 0;
		}
		else {
		int res=x*powerRec(x,(n-1));
		return res;
		}
	}

}
