package trie;
class Node{
	boolean isEnd;
	Node[] child=new Node[26];
	Node() {
		for(int i=0;i<child.length;i++) {
			child[i]=null;
			isEnd=false;
		}
	}
}
public class Trie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
