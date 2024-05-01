package concepts;
import java.util.*;
public class group_anagram_leetcode {
	public static void main(String args[]) {
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		
	}
	private static String generateKey(String str) {
		int[] fre = new int[26];
		for(int i = 0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			fre[ch-'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<fre.length;i++) 	sb.append(fre[i]);
		return sb.toString();
		
	}
	private static List<List<String>> solution(String[] arr){
		 List<List<String>> ans = new ArrayList<>();
		 HashMap<String,List<String>> map = new HashMap<>();
		 for(int i = 0 ; i<arr.length;i++) {
			 String key = generateKey(arr[i]);
			 if(!map.containsKey(key)) {
				 map.put(key, new ArrayList<>());
			 }
			 map.get(key).add(arr[i]);
			 
		 }
		 
		 for(String key : map.keySet()) {
			 ans.add(map.get(key));
		 }
		 
		 
		 return ans;
	}
}
