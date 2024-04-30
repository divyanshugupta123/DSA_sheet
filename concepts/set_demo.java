package concepts;

import java.util.*;

public class set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();

		
		
//		no duplicate element comes in the set
		set.add(-90);
		set.add(9);
		set.add(77);
		set.add(56);
		set.add(88);
		set.add(56);
		// set.add(null);
		System.out.println(set);
//		System.out.println(set.remove(-90));
//		System.out.println(set);
//		System.out.println(set.contains(88));

		
		
		
//		sorting order m aata hai or null nahi daal sakte
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(-90);
		set1.add(9);
		set1.add(77);
		set1.add(56);
		set1.add(88);
		set1.add(56);
//		set1.add(null);
		System.out.println(set1);

		
		
		
//		insertion order preserved rhta hai
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(-90);
		set2.add(9);
		set2.add(77);
		set2.add(56);
		set2.add(88);
		set2.add(56);
		//set2.add(null);
		System.out.println(set2);

	}

}