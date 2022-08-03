package may2022;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			String myStr=sc.nextLine();
			System.out.print(substringLength(myStr));
	}
	public static int substringLength(String str){
		int cc=0;
		for(int i=0;i<str.length();i++){
			int[] myArray=new int[256];
			int count=0;
			for(int j=i;j<str.length();j++){
				int x=(int)str.charAt(j);
				if(myArray[x]==0){
					myArray[x]=1;
					count++;
				}
				else{
					break;
				}
			}
			if(cc<count){
				cc=count;
			}
		}
		return cc;
	}

}
