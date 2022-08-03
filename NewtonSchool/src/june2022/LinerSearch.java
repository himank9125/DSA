package june2022;

import java.util.Scanner;

public class LinerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int[] arr=new int[5];
		int[] arr= {2,5,7,8,9,11,54,5};
		int elm=9;
		for(int i=0;i<arr.length;i++) {
			if(elm==arr[i]) {
				System.out.print(i);
				break;
			}
		}
	}

}



