package practice25June;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,7,8,4,5,9,2,1,4,5,7,4,1};
		quickSort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}


	}
	static void quickSort(int[] arr, int start, int end) {
		if(start>end) {
			return;
		}
		int pvt=pivotIdx(arr, start,end);
		quickSort(arr, start, pvt-1);
		quickSort(arr,pvt+1,end);
	}
	static int pivotIdx(int[] arr,int start,int end) {
		int sel=arr[start];
		int count=start;
		for(int i=start+1;i<=end;i++) {
			if(sel>=arr[i]) {
				count++;
			}
		}
		int ix=start+1;
		for(int i=start+1;i<=end;i++) {
			if(arr[i]<=sel) {
				int temp=arr[i];
				arr[i]=arr[ix];
				arr[ix]=temp;
				ix++;
				
			}
		}
		int temp=arr[start];
		arr[start]=arr[count];
		arr[count]=temp;
		return count;
		
	}

}
