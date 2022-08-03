package april.test;

public class mayRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fabSeries(3));

	}
public static int fabSeries(int n) {
	if(n==0) {
		return 0;
	}
	if(n==1) {
		return 1;
	}
	int res1=fabSeries(n-1);
	int res2=fabSeries(n-2);
	int result=res1+res2;
	return result;
}
}
