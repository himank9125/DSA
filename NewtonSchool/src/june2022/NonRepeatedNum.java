package june2022;

public class NonRepeatedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,1,3,4,5,6,3,5};
		result(arr);

	}
	public static void result(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int test=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					test=1;
				}
							
			}
			if(test==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
