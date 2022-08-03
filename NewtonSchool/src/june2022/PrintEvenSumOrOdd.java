package june2022;

public class PrintEvenSumOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,8,5,7,4,3,1};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		if(count>=4) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					sum+=arr[i];
				}
			}
			System.out.print(sum);
		}
		else {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==1) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
