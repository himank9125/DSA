package graph;
import java.util.*;
class Graph3{
	ArrayList<Pqdata>[] list;
	Graph3(int x){
	list=new ArrayList[x];
	for(int i=0;i<x;i++) {
		list[i]=new ArrayList<Pqdata>();
	}
	}
public void input(int v1, int v2, int wt) {
	list[v1].add(new Pqdata(v2,wt));
}
}

class Pqdata implements Comparable<Pqdata>{
	int idx;
	int wt;
	Pqdata(int idx, int wt){
		this.idx=idx;
		this.wt=wt;
	}
	public int compareTo(Pqdata g) {
		return this.wt-g.wt;
	}
}

public class Dijkstra {

	public static void main(String[] args) {
		int V=9;
		int E=14;
		Graph3 g=new Graph3(V);
		g.input(0, 1, 4);
	    g.input(0, 7, 8);
	    g.input(1, 2, 8);
	    g.input(1, 7, 11);
	    g.input(2, 3, 7);
	    g.input(2, 8, 2);
	    g.input(2, 5, 4);
	    g.input(3, 4, 9);
	    g.input(3, 5, 14);
	    g.input(4, 5, 10);
	    g.input(5, 6, 2);
	    g.input(6, 7, 1);
	    g.input(6, 8, 6);
	    g.input(7, 8, 7);
		
		int[] arr=new int[V];
		TreeSet<Pqdata> set=new TreeSet<>();
		set.add(new Pqdata(0,0));
		for(int i=1;i<V;i++) {
			set.add(new Pqdata(i,1000000));
		}
		while(!set.isEmpty()) {
			Pqdata p=set.pollFirst();
			while(!g.list[p.idx].isEmpty()) {
				Pqdata r=g.list[p.idx].get(0);
				g.list[p.idx].remove(0);
				if(set.contains(r.idx)) {
					if(p.wt>(p.wt+r.wt)){
						
					}
				}
			}
		}
	}

}
