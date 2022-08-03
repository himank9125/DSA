package classnObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Numbers implements Comparable<Numbers>{
	int nums;
	int fr;
	public Numbers(int nums,int fr) {
		this.nums=nums;
		this.fr=fr;
	}
	@Override
	public int compareTo(Numbers o) {
		return this.fr-o.fr;
	}
}

public class FreqClass {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,1,2,4,1,5,2,1,4,2,1,3,6,2,6,2,5,1,5,1,1,1,1};
		// TODO Auto-generated method stub
		result(arr);

	}
	static void result(int[] arr) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		List<Numbers> list=new ArrayList<>();
		for(int i:map.keySet()) {
			Numbers nm=new Numbers(i,map.get(i));
			list.add(nm);
		}
		Collections.sort(list);
		for(Numbers i:list) {
			System.out.println(i.nums+" "+i.fr);
		}
	}

}
