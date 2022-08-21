package prc21Aug;

public class Selection {

	public static void main(String[] args) {
		int[] arr= {5,8,4,9,1,2};
		for(int i=0;i<arr.length;i++) {
			int temp=Integer.MAX_VALUE;
			int idx=-1;
			for(int j=i;j<arr.length;j++) {
				if(temp>arr[j]) {
					temp=arr[j];
					idx=j;
				}
			}
			swapping(arr,idx,i);
		}
		for(int i:arr) {
		System.out.print(i+" ");
		}
}
	
	public static void swapping(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
