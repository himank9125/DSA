package bitManipulation;
import java.util.*;

public class Bit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		20=10100    
		int val=sc.nextInt();
		int idx=sc.nextInt();
		int bitMask=1<<idx;
		if((val & bitMask)==0) {
			System.out.println(val|bitMask);
		}
		else {
			System.out.println(val&(~bitMask));
		}
	}

}
