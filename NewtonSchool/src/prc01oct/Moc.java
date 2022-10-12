package prc01oct;

import java.util.LinkedList;

class Graph{
	int x;
	LinkedList<Integer>[] arr;
	Graph(int x){
		arr=new LinkedList[x];
		for(int i=0;i<x;i++) {
			arr[i]=new LinkedList<Integer>();
		}
	}
	
	public void input(int v1, int v2) {
		arr[v1].add(v2);
		arr[v2].add(v1);
	}
	
	public void print() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"---->"+arr[i]);
			
		}
	}
	
	
}
public class Moc {

	public static void main(String[] args) {
		int V=5;
		Graph gg=new Graph(V);
		gg.input(0, 1);
		gg.input(0, 4);
		gg.input(1, 2);
		gg.input(2, 4);
		gg.input(2, 3);
		
		gg.print();

	}

}
