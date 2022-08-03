package may2022;

public class AddingElemInArray {

	public static void main(String[] args) {
		int[] arr= {4,5,8,4,6,3,7,2};
		int x=20;
		int[] result=new int[arr.length+1];
		result=modefiedArray(arr,x);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		// TODO Auto-generated method stub

	}
	
	public static int[]  modefiedArray(int[] arr,int elm){
		int[] myArr=new int[arr.length+1];
		myArr[arr.length]=elm;		
		for(int i=0;i<arr.length;i++){
			myArr[i]=arr[i];
		}
		return myArr;
		}

}
