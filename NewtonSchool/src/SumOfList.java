import java.util.HashSet;
import java.util.Set;

public class SumOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {161, 182, 161, 154, 176, 170, 167, 171, 170, 174};
		System.out.print(result(A));

	}
	static double result(int[] arr) {
		Set<Integer> arrSet=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			arrSet.add(arr[i]);
		}
		int sum=0;
		for(int i:arrSet) {
			sum+=i;
		}
		return (double)sum/arrSet.size();
	}

}
