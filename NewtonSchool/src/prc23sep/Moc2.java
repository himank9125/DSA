package prc23sep;

import java.util.LinkedList;
import java.util.Stack;

public class Moc2 {
	public static void main(String[] args) {
		String str="abcbah";
		System.out.println(pallendrome(str,0,(str.length()-1)));
}
	public static boolean pallendrome(String str, int i, int j) {
		if(i>j) {
			return true;
		}
		if(str.charAt(i)==str.charAt(j)) {
			return pallendrome(str,i+1,j-1);
		}
		return false;
	}
	

}
