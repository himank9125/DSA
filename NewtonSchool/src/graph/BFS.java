package graph;
import java.util.*;
class Him{
	int a;
	int b;
	Him(int a, int b){
		this.a=a;
		this.b=b;
	}
}
class Graphh{
	ArrayList<Integer>[] list;
	Graphh(int x){
		list=new ArrayList[x];
		for(int i=0;i<x;i++) {
			list[i]=new ArrayList<Integer>();
		}
	}
	public void putEdges(int v1, int v2) {
		list[v1].add(v2);
		list[v2].add(v1);
	}
	
	public void print() {
		for(int i=0;i<this.list.length;i++) {
			System.out.print(i+"---->");
			while(!list[i].isEmpty()) {
				System.out.print(list[i].get(0)+" ");
				list[i].remove(0);
			}
			System.out.println();
		}
	}
	
	public int height(boolean[] arr, int a, int x) {
		if(a==x) {
			return 0;
		}
		Queue<Integer> q=new LinkedList<>();
		int count=1;
		q.add(a);
		arr[a]=true;
		while(!q.isEmpty()) {
			int k=q.size();
			while(k-->0) {
			int j=q.poll();
			for(int i:list[j]) {
				if(!arr[i]) {
					if(i==x) {
						return count;
					}
					q.add(i);
					arr[i]=true;
				}
			}
		}
			count++;
		}
		return count;
		
	}
	
//	public int heightt(boolean[] arr, int s, int d) {
//		if(s==d) {
//			return 0;
//		}
//		int count=1;
//		Queue<Integer> q=new LinkedList<>();
//		q.add(s);
//		arr[s]=true;
//		while(!q.isEmpty()) {
//			int sz=q.size();
//			while(sz-->0) {
//				int val=q.poll();
//				for(int i:list[val]) {
//					if(i==d) {
//						return count;
//					}
//					if(!arr[i]) {
//						q.add(i);
//						arr[i]=true;
//					}
//				}
//			}
//			count++;
//		}
//		return -1;
//	}
}

public class BFS {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		int V=7;
		int E=9;
		Graphh g=new Graphh(V);
		int[] a1= {0,0,1,3,6,4,3,5,1};
		int[] a2= {1,2,3,6,4,2,5,4,2};
		for(int i=0;i<E;i++) {
			g.putEdges(a1[i], a2[i]);
		}
//		g.print();
		boolean[] arr=new boolean[V];
		System.out.println(g.height(arr,5,6));

	}

}
