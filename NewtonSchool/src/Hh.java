import java.util.HashMap;
import java.util.Map;

public class Hh {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 2,1,4,3};
		result(arr);
	}
	static void result(int[] arr) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		int sum=0;
		for(int i:map.keySet()) {
			if(map.get(i)==1) {
				sum+=i;
			}
		}
		System.out.print(sum);
		
	}

}
