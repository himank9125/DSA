package collections;

import java.util.HashSet;
import java.util.Set;

public class MyTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Having only unique Values;
		// Sorted Order......
				Set<Integer> mySet=new HashSet<>();
				mySet.add(20);
				mySet.add(23);
				mySet.add(96);
				mySet.add(14);
				mySet.add(14);     // Duplecasy not possible
				
				System.out.println(mySet);
				System.out.println(mySet.contains(30));  /// Return true/false.
				System.out.println(mySet.isEmpty());
				System.out.println(mySet.size());
				mySet.clear();
				mySet.remove(23);
				System.out.println(mySet);
			

	}

}
