package classnObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class student implements Comparable<student>{
	String name;
	int fr;
	
	student(String name,int fr){
		this.name=name;
		this.fr=fr;
	}

	@Override
	public int compareTo(student st) {
		if(this.fr>st.fr) {
			return -1;
		}
		if(this.fr<st.fr) {
			return 1;
		}
		else {
				return -1;
		}
	}
}

public class FreqMapCharSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st= {"mayank","jatin","jatin","himanshu","jatin","himanshu","vijay","amit"};
		sortedOrder(st);
	}
	static void sortedOrder(String[] str) {
		Map<String,Integer> map=new HashMap<>();
		for(String s:str) {
			if(map.containsKey(s)) {
				int freq=map.get(s);
				map.put(s, freq+1);
			}
			else {
			map.put(s, 1);
			}
		}
		List<student> list=new ArrayList<>();
		for(String sr: map.keySet()){
			student std=new student(sr,map.get(sr));
			list.add(std);
		}
		Collections.sort(list);
		for(student lt:list) {
			System.out.println(lt.name+"------->"+lt.fr);
		}
	}

}
