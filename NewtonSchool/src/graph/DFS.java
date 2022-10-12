package graph;

import java.util.*;

class Graf{
	ArrayList<Integer>[] list;
	Graf(int x){
		list=new ArrayList[x];
		for(int i=0;i<list.length;i++) {
			list[i]=new ArrayList<Integer>();
		}
	}
	public void insertedges(int v1, int v2) {
		list[v1].add(v2);
		list[v2].add(v1);
		
	}
	
	public boolean checkLink(int src, int dst, boolean[] arr) {
		if(src==dst) {
			return true;
		}
		for(int i:list[src]) {
			if(!arr[i]) {
				arr[i]=true;
				return checkLink(i,dst,arr);
			}
		}
		return false;
	}
	
	public boolean checkLinkk(int s, int d, boolean[] arr) {
		Stack<Integer> stk=new Stack<>();
		stk.push(s);
		arr[s]=true;
		while(!stk.isEmpty()) {
			int x=stk.pop();
			if(x==d) {
				return true;
			}
			for(int i: list[x]) {
				if(!arr[i]) {
					arr[i]=true;
					stk.push(i);
				}
			}
		}
		return false;
	}
}

public class DFS {

	public static void main(String[] args) {
		int E=7;
		int V=8;
		Graf g=new Graf(E);
		int a1[]= {0,0,1,3,6,4,3,5};
		int a2[]= {1,2,3,6,4,2,5,4};
		for(int i=0;i<V;i++) {
			g.insertedges(a1[i], a2[i]);
		}
		boolean arr[]=new boolean[E];
		System.out.println(g.checkLink(5, 2, arr));
	}

}
