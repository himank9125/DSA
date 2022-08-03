package april.test;

import java.util.Scanner;

public class April_Class {

	public static void main(String[] args) {
		
		System.out.print(Reverse(125416));
		
		// TODO Auto-generated method stub
		//System.out.print("hello java");
		
//		int[] arr= {20,45,-45,10,74,51,12,8};
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+", ");	
//		}
//		System.out.println();
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		System.out.print(FindAddress(arr,a)+"\n");
//		//System.out.print(a+"\n");
//		for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+", ");
//		}
		//////////////////////////////////
//		Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();
//        for(int i=0;i<T;i++){
//            int N=sc.nextInt();
//            int[] hsarr=new int[N];
//            for(int j=0;j<N;j++){
//                hsarr[j]=sc.nextInt();
//            }
//          maxes(hsarr);
//        }
        
		
        
		
		
		
		
		//////////////////////////////////////////
	}
	public static int FindAddress(int[] ars, int x) {
		for(int i=0;i<ars.length;i++) {
			if(ars[i]==x) {				
				return i;
			}
		}
		ars[2]= ars[3]=0;
		return -1;
	}
	
	/////////////////////////////////////////////
	
	public static void maxes(int[] arr){
        int max=1;
        int max2=1;
        int max3=1;
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max3=max2;
                max2=max;
                max=arr[i];
            }
            else if(max2<=arr[i]){
                max3=max2;
                max2=arr[i];
            }
            else if(max3<arr[i]){
                max3=arr[i];
            }
        }
        System.out.print(max+" "+max2+" "+max3);
    }
	
	public static int Reverse(int n) {
		int rev=0;
		while(n!=0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		return rev;
	}

}
