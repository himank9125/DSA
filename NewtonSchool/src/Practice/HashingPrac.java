package Practice;

import java.util.HashMap;

public class HashingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,1,2,4,5,1,4,1,4,8};
		hashFun(arr);

	}
	public static void hashFun(int[] arr) {
		HashMap<Integer,Integer> myHash=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(myHash.containsKey(arr[i])) {
				int freq=myHash.get(arr[i]);
				freq+=1;
				myHash.put(arr[i], freq);
			}
			else {
				myHash.put(arr[i], 1);
			}
		}
		//System.out.print(myHash.keySet());
		for(int i:myHash.keySet()) {
			System.out.println(i+" --> "+myHash.get(i));
		}
	}

}
