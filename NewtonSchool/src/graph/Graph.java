package graph;

import java.util.ArrayList;

class Graphy{
	int x;
	ArrayList<Integer>[] arr;
	Graphy(int x){
		this.x=x;
		arr=new ArrayList[x];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new ArrayList<>();
		}
	}
	public void add(int u, int v) {
		arr[u].add(v);
		arr[v].add(u);
	}
	
	public void print() {
		for(int i=0;i<x;i++) {
			System.out.print(i+"---->");
			for(int j:arr[i]) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
}

public class Graph {

	public static void main(String[] args) {
		Graphy gg=new Graphy(7);
		gg.add(0,1 );
		gg.add(0,2 );
		gg.add(0,6 );
		gg.add(1,5 );
		gg.add(5,2 );
		gg.add(5,3 );
		gg.add(3,4 );
		gg.add(4,2 );
		gg.add(2,6 );
		gg.add(4,6 );
		
		gg.print();
	}

}
