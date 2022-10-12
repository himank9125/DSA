package recursion;

public class StringPermutation {

	public static void main(String[] args) {
		String str="abc";
		String sk="";
		printPermutation(str,sk);

	}
	public static void printPermutation(String str, String ss) {
			if(str.length()==0) {
				System.out.println(ss);
				return;
			}
			for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			String nn=str.substring(0,i)+str.substring(i+1);
			printPermutation(nn,ss+c);
		}
			
	}

}
