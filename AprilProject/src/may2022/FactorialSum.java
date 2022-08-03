package may2022;

public class FactorialSum {

	public static void main(String[] args) {
		System.out.print(sumOfAllDigit(4544211));
		
		// TODO Auto-generated method stub

	}
	public static int sumOfAllDigit(int n) {
		int temp;
		if(n<10) {
			return n;
		}
		else {
			temp=n%10;
		}
		int result=temp+sumOfAllDigit(n/10);
		return result;
	}

}
