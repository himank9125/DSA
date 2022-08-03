import java.util.Scanner;

public class Kcercle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[]lock=new int[N];
		int[]code=new int[N];
		for(int i=0;i<N;i++){
			lock[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			code[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<N;i++){
			int x=Math.min(lock[i],code[i]);
			int y=Math.max(lock[i],code[i]);
			if((y-x)>(10+x-y)){
				sum+=(10+x-y);
			}
			else{
				sum+=(y-x);
			}
		}
		System.out.print(sum);

	}
	

}
