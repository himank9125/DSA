package hashing;

import java.util.HashMap;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Integer,Integer> myHash=new HashMap<>();
		int[] arr= {4,6,3,2,1,4,2,1,3,5,1,2,3,8,5,4,1};
		hashingFun(arr);

	}
	public static void hashingFun(int[] arr) {
		HashMap<Integer,Integer> himHash=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			if(himHash.containsKey(element)) {
				int freq=himHash.get(element);
				freq+=1;
				himHash.put(element, freq);
			}
			else {
				himHash.put(element, 1);
			}
		}
		for(int i:himHash.keySet()) {
			if(himHash.get(i)>1) {
			System.out.println(i+"-->"+himHash.get(i));
			}
		}
		
	}

}
