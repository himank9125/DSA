package practice25June;

public class StringNewClass {

	public StringNewClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * str.length()
		 * str.subString(idx)
		 * str.subString(idx,idx)
		 * s1.isEquals(s2)
		 * str.contains("hello");
		 * str.concat(str2)
		 * replace
		 * Split  /// will store in array
		 * str.indexOf("v")
		 * toLowerCase\
		 * toUpperCase
		 * trim
		 * 
		 * 
		 * 
		 */
		
		String str="Mayank Singh Rajpoot";
		System.out.println(str);
		str.substring(6);
		System.out.println(str.substring(8,9));
		System.out.println(str.length());
		String st=str.substring(6);
		System.out.println(st.length());
		System.out.println(str.contains("Singh"));
		String s1="Hamish";
		String s2=new String("Hamish");
		String s3="Hamish";
		System.out.println("s1==s2  "+s1==s2);
		System.out.println("s1==s3  "+s1==s3);
		System.out.println(s1.equals(s2));
		String s4="";
		System.out.println(s4.isEmpty());
		System.out.println(str.concat(" hello"));
		System.out.println(str.replace("Singh", "Ranj"));
		str="naveen Manoj Raaju vijay";
		String[] ss=str.split(" ");
		for(String s:ss) {
			System.out.println(s+" ");
		}
		System.out.println(str.indexOf("v"));
		str="    himanshu       ";
		System.out.println(str);
		System.out.println(str.trim());
		
		
	}

}
