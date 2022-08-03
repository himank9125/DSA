package oOpsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorColl {
	public static void main(String[]a) {
	LinkedList list=new LinkedList<>();
	list.add(5);
	list.add(6);
	list.add("nayan");
	Iterator it=list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	}

}
