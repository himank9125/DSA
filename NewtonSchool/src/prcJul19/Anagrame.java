package prcJul19;

import java.util.HashMap;
import java.util.Map;

public class Anagrame {

	public static void main(String[] args) {
		String s1="AbcdEFGk";
		String s2="AbcdEFGk";
		System.out.println(checkAnagrame(s1,s2));
	}
	@SuppressWarnings("unlikely-arg-type")
	public static boolean checkAnagrame(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		Map<Character,Integer> map= new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			if(map.containsKey(s1.charAt(i))){
				map.put(s1.charAt(i), map.get(s1.charAt(i)+1));
			}
			else {
				map.put(s1.charAt(i), 1);
			}
		}
		for(int i=0;i<s2.length();i++) {
			if(map.containsKey(s2.charAt(i))) {
				map.put(s2.charAt(i),map.get(s2.charAt(i)-1));
			}
		}
//		return map.isEmpty();
		for(char i:map.keySet()) {
			if(map.get(i)!=null) {
				return false;
			}
		}
		return true;
	}

}
