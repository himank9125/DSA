package april.test;

public class Reverse {

	public static void main(String[] args) {
		int x=12345;
		int res=reverse(x,0);
		System.out.print(res);
	}
	public static int reverse(int x, int y) {
		if(x==0) {
			return y;
		}
		int u=x%10;
		y=y*10+u;
		return reverse(x/10,y);
	}

}
