package oOpsConcept;

public class Recursion {

	public static void main(String[] args) {
		int x=sum(20);                                                           
	}
	public static int sum(int i){
		if(i==0) {
			return 0;
		}
		System.out.println("i= "+i);
		return i+sum(i-1);
	}

}
