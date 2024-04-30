package concepts;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();

		// add
		// O(1)
		
		
//		hashmap m hum null daal skte hain and vo kisi bhi order m data ko return krta hai just to do operation within O(1)
		map.put("Riya", 90);
		map.put("Nitish", 77);
		map.put("Akash", 67);
		map.put("Zaid", 76);
		map.put("Omika", 88);
		map.put("Puneet", 77);
		// System.out.println(map);
		
		
		
		// ways 1
//		for displaying the hashmap in our own choice 
		
//		keyset se sari keys aajaengi
		Set<String> key = map.keySet();
		// System.out.println(key);

		
//		ab key aagyi to uspr iterate krke sari values manvga lenge
		
		for (String k : key) {
			System.out.println(k + " " + map.get(k));

		}
		// way 2
		System.out.println("***		way 2	 *****");

		for (String k : map.keySet()) {
			System.out.println(k + " " + map.get(k));
		}
		
		
		
		
		System.out.println("*********** 	WAY 3 	********");
		ArrayList<String> ll = new ArrayList<>(map.keySet());
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i) + " " + map.get(ll.get(i)));
		}

		// map.put("Omika", 28);
		// map.put(null, 89);
		// System.out.println(map);

		// get
		// O(1)
//		System.out.println(map.get("Raj"));
//		System.out.println(map.get("Omika"));
//		System.out.println(map.get("Nitish"));

		// containsKey O(1)

//		System.out.println(map.containsKey("Rahul"));
//		System.out.println(map.containsKey("Nitish"));

		// remove O(1)
//		System.out.println(map);
//		System.out.println(map.remove("Faraz"));
//		System.out.println(map.remove("Nitish"));
//		System.out.println(map);

		
		
		
		
		
//		treemap m sara data dicto order m sort krke return krta hai 
//		isme key bhi null ho skta hai kyuki key sorted format m hota hai
//		iske sare opr ki complexity logN hoti hai
		
//		TreeMap<String, Integer> map1 = new TreeMap<>();

		// add
//		// log(N)
//		map1.put("Riya", 90);
//		map1.put("Nitish", 77);
//		map1.put("Akash", 67);
//		map1.put("Zaid", 76);
//		map1.put("Omika", 88);
//		map1.put("Puneet", 77);
//		System.out.println(map1);
		/// map1.put("Omika", 28);
		// System.out.println(map1);

		
		
		
		
		
//		linkedhashmap m jis order m data daalaenge vahi order m return hoga 
//		isme key null ho skta hai kyuki koi sorting ka lafda nahi hai isme
		
		// LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		// O(1)
//		map2.put("Riya", 90);
//		map2.put("Nitish", 77);
//		map2.put("Akash", 67);
//		map2.put("Zaid", 76);
//		map2.put("Omika", 88);
//		map2.put("Puneet", 77);
//		System.out.println(map2);
//		map2.put("Omika", 8);
//		map2.put(null, 7);
//		System.out.println(map2);

	}

}