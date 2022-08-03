package may2022;

public class recfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(f(5));

	}
	public static int f(int x) {
		if(x<=0) {
			return 1;
		}
		else {
			return f(x-1)+f(x-2);
		}
	}

}
