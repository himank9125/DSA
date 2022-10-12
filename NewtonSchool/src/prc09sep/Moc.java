package prc09sep;

import java.util.ArrayList;
import java.util.Collections;

public class Moc {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(9);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		list.add(5);
		list.add(11);
		list.add(6);
		System.out.println(list);

	}

}
