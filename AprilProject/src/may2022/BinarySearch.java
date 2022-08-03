package may2022;

public class BinarySearch {

	public static void main(String[] args) {
		int[] myarr= {1,2,3,4,5,6,7,8,9};
		int x=4;
		System.out.print(searcHElement(myarr,x));
		// TODO Auto-generated method stub

	}
	
public static boolean searcHElement(int[] arr, int ele) {
	int start=0;
	int end=arr.length-1;
	
	
	while(start<=end) {
	int mid=(start+end)/2;
	
	if(ele>arr[mid]) {
		start=mid+1;		
	}
	else if(ele<arr[mid]) {
		end=mid;
	}
	else{
		return true;		
	}
	}
	return false;
}

}
