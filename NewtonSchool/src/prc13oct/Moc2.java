package prc13oct;

import java.util.ArrayList;

class Graph{
	ArrayList<Integer>[] list;
	Graph(int V){
		for(int i=0;i<V;i++) {
			list[i]=new ArrayList<Integer>();
		}
	}
	
	public void input(int v1, int v2) {
		list[v1].add(v2);
	}
	
	public void traversal(boolean[] arr, int v) {
		
	}
}

public class Moc2 {
	

	public static void main(String[] args) {
		int V=6;
		Graph gg=new Graph(V);
		gg.input(5, 4);
		gg.input(5, 0);
		gg.input(2, 3);
		gg.input(3, 1);
		gg.input(4, 1);
		gg.input(4, 0);
		
		boolean[] arr=new boolean[V];
		

	}

}
