package prc17sep;

public class Test {

	public static void main(String[] args) {
		System.out.println(sum(5));

	}
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		System.out.println(n);
		return n+sum(n-1);
	}
	
}
