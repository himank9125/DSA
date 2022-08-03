package june2022;

import java.util.HashMap;
import java.util.Scanner;


public class Test {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		char[] cr=new char[5];
		for(int i=0;i<5;i++){
			cr[i]=sc.next().charAt(i);
		}
		result(cr);
				
	}
	public static void result(char[] arr){
		HashMap<Character,Character> hs= new HashMap<>();
		for(int i=0;i<arr.length;i++){
			hs.put(arr[i],arr[i]);
		}
		System.out.print(hs.keySet());	
	}
}


