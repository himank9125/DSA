package moc27aug;

public class Moc {
	static int[] arr;
	public static void main(String[] args) {
		int x=1;
		arr=new int[x+1];
		arr[0]=0;
		arr[1]=1;
	     fabonacy(x,2);
	     
	     for(int i:arr) {
	    	 System.out.print(i+" ");
	     }
	}
	
	public static void fabonacy(int x,int start) {
		if(start>x) {
			return;
		}
		arr[start]=arr[start-1]+arr[start-2];
		fabonacy(x,start+1);
	}

}


