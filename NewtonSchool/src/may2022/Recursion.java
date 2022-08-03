package may2022;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(devisor(100));

	}
	public static int devisor(int N){
		int i=N/2;
		while(i>0){
			if(N%i==0 && i%2!=0){
				return i;
			}
			else{
				i--;
			}
		}
		return i;
	}
}
