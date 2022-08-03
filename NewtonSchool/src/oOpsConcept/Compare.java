package oOpsConcept;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class Teachers implements Comparable<Teachers>{
	String name;
	int age;
	int marks;
	Teachers(int age,String name,int marks){
		this.age=age;
		this.name=name;
		this.marks=marks;
	}
	public int compareTo(Teachers T) {
		if(this.age==T.age) {
			if(this.name.compareTo(T.name)==0) {
				return this.marks-T.marks;
			}
			return this.name.compareTo(T.name);
		}
			return this.age-T.age;
	}
	
}
class SortByName implements Comparator<Teachers>{
	public int compare(Teachers T1,Teachers T2) {
		return T1.name.compareTo(T2.name);
	}
}


public class Compare {

	public static void main(String[] args) {
	List<Teachers> list=new ArrayList<>();
	list.add(new Teachers(30,"abhinav",222));
	list.add(new Teachers(30,"abinav",215));
	list.add(new Teachers(42,"vishal",325));
	list.add(new Teachers(42,"jaadu",502));
	list.add(new Teachers(82,"lovely",409));
	list.add(new Teachers(39,"raju",108));
	for(Teachers tc:list) {
		System.out.println(tc.name+"----->"+tc.age+"------->"+tc.marks);
	}
	Collections.sort(list, new Comparator<Teachers>() {
		public int compare(Teachers T1, Teachers T2) {
			return T1.name.compareTo(T2.name);
		}
	}
	);
	
	System.out.println("After Sorting");
	for(Teachers tc:list) {
		System.out.println(tc.name+"------->"+tc.age+"------>"+tc.marks);
	}
	
	Iterator<Teachers> itr=list.iterator();
	while(itr.hasNext()) {
		Teachers tt=itr.next();
		System.out.println(tt.name+" "+tt.age+" "+tt.marks);
	}
	}

}
