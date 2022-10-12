package graph;

import java.util.ArrayList;

class Grp{
	int x;
	ArrayList<Integer>[] list;
	Grp(int x){
		this.x=x;
		list=new ArrayList[x];
		for(int i=0;i<x;i++) {
			list[i]=new ArrayList<Integer>();
		}
	}
	public void add(int u, int v) {
		list[u].add(v);
		list[v].add(u);
	}
	
	public  void print() {
		for(int i=0;i<this.list.length;i++) {
			System.out.print(i+"--->");
			for(int j:list[i]) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void doBFS(int u, int v) {
		boolean[] bfs=new boolean[this.x];
		updateBfs(u,bfs);
		System.out.println(bfs[v]);
	}
	
	private void updateBfs(int u, boolean[] bfs) {
		if(bfs[u]) {
			return;
		}
		bfs[u]=true;
		for(int i: list[u]) {
			if(!bfs[i]) {
				updateBfs(i,bfs);
			}
		}
	}
	
}
public class Graph2 {

	public static void main(String[] args) {
		Grp gr=new Grp(10);
		gr.add(0,1);
		gr.add(0,2);
		gr.add(0,6);
		gr.add(1,5);
		gr.add(5,2);
		gr.add(5,3);
		gr.add(3,4);
		gr.add(4,2);
		gr.add(2,6);
		gr.doBFS(0, 4);


	}

}
