package aug03;

public class StringPrep {

	public static void main(String[] args) {
		String str="Allahabad";
		String ss="";
		for(int i=(str.length());i>0;i--) {
			ss+=str.substring(i-1,i);
		}
		System.out.println(ss);

	}

}
