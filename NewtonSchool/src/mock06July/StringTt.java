package mock06July;

public class StringTt {

	public static void main(String[] args) {
		String str="my name is danish khan";
//		String[] aa=str.split(" ");
//		for(String s:aa) {
//			s.toUpperCase();
//		}
//		char str.charAt(0)=Character.toUppercase(str.charAt(0));
		
		char ss=Character.toUpperCase(str.charAt(0));
		System.out.print(ss);
		//System.out.println(Character.isUpperCase(str.charAt(0)));
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				ss=Character.toUpperCase(str.charAt(i+1));
				System.out.print(ss);
			}
			else {
				ss=str.charAt(i);
				System.out.print(ss);
			}
			
		}
		
		
	}

}
