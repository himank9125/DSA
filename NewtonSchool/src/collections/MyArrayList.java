package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(50);
		list.add(30);
		list.add(11);
		list.add(90);
		System.out.println(list.get(1));
		// insert at index
		list.add(2,26);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//list.remove(0);
		System.out.println(list);
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(93);
		list1.add(47);
		list.add(14);
		list1.add(96);
		//list.remove(3);
		list.addAll(list1);
		System.out.println(list);
		System.out.println(list.contains(40));
		for(int i:list) {
			System.out.print(i+" ");
		}
		//Iterator<Integer> it=list.iterator();
		//hasNext()   .next();
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.print("Through Iterator "+it.next());
		}
	}
	
}
