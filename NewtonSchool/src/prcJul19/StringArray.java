package prcJul19;

import java.util.HashMap;

public class StringArray {

	public static void main(String[] args) {
		String[] str= {"aabbbcca","abcbbcd","abcdcbcfv","","abcfdxcs","aabbaabbbaa","aaaa",""};
		String[] res=result(str);
		for(String s:res) {
			System.out.print(s+" ");
		}
	}
	public static String[] result(String[] str) {
		for(int i=0;i<str.length;i++) {
			HashMap<Character,Character> map=new HashMap<>();
			String ss="";
			for(int j=0;j<str[i].length();j++) {
				if(map.containsKey(str[i].charAt(j))) {
					continue;
				}
				else {
					map.put(str[i].charAt(j), str[i].charAt(j));
					ss+=str[i].charAt(j);
				}
			}
			str[i]=ss;
		}
		return str;
	}

}
