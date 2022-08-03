package maths;

public class Prime {

	public static void main(String[] args) {
		int num=30;
		boolean [] arr=new boolean[num+1];
		for(int i=2;i<arr.length;i++) {
			arr[i]=true;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(arr[i]) {
				for(int j=i*2;j<arr.length;j+=i) {
					arr[j]=false;
				}
			}
		}
		int count=0;
		for(int i=2;i<arr.length;i++) {
			if(arr[i]) {
				count++;
			}
		}
		System.out.print(count);
		
	}

}
