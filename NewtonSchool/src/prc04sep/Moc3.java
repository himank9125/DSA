package prc04sep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Moc3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ss="";
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
				ss+=str.charAt(i);
			}
		}
		String unique="";
		for(char i: map.keySet()) {
			if(map.get(i)==1) {
				unique+=i;
			}
		}
		System.out.println("The Unique Part is "+unique);
		System.out.println("This is the distinct part "+ss);
	}

}
