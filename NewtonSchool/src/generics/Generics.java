package generics;
class gen{
	public <T>void print(T[] x) {
		System.out.println("This is a Generic Function");
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
}

public class Generics {

	public static void main(String[] args) {
		gen genObj=new gen();
		Integer[] arr= {1,2,3,4,5,7,4,8,5,1};
		String[] arr1= {"Naveen","Mayank","Vinay","Sachin","Rajeev"};
		genObj.print(arr1);
		genObj.print(arr);

	}

}
