import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashingSarang {

	public static void main(String[] args) {
	String ss="my name is khan and i am a good man";
//	System.out.print(ss.substring(0,1).toUpperCase());
//	for(int i=1;i<ss.length();i++) {
//		if(ss.charAt(i)==' ') {
//		System.out.print(" ");
//		System.out.print(ss.substring(i+1,i+2).toUpperCase());
//		i++;
//		}
//		else {
//			System.out.print(ss.charAt(i));
//		}
//	}	
	String[] str=ss.split(" ");
	for(String k:str) {
		System.out.print(k.substring(0,1).toUpperCase()+k.substring(1)+" ");
	}
	}
	static String reverse(String str) {
		StringBuilder st=new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			st.setCharAt((str.length()-i-1),str.charAt(i));
		}
		return st.toString();
		
	}
}


