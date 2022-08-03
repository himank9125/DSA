
public class Ascii {

	public static void main(String[] args) {
		String s="newtonone";
//		char[] arr=new char[s.length()];
//		for(int i=0;i<s.length();i++) {
//			arr[i]=s.charAt(i);
//		}
//		for(int i=0;i<s.length();i++) {
//			System.out.print(arr[i]+" ");
//		}
		int[] arr=new int[256];
		for(int i=0;i<s.length();i++) {
			int x=s.charAt(i);
			arr[x]=1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				char c=(char)i;
				System.out.print(c+" ");
			}
		}
	}

}
