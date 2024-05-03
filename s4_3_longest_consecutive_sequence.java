import java.util.*;
public class s4_3_longest_consecutive_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {};
		System.out.println(solution(arr));
	}
//	private static int solution(int [] arr) {
//		int count = 0;
//		int curCount = 0;
//        if(arr.length==0) {
//			return 0;
//		}
//		Arrays.sort(arr);
//		for(int i = 0;i<arr.length-1;i++) {
//			
//			if(arr[i+1]-arr[i]==1) {
//				curCount++;
//			} else if (arr[i+1] != arr[i]) { // Handle duplicate elements
//                count = Math.max(count, curCount);
//                curCount = 0; // Reset curCount
//            }
//			count = Math.max(count, curCount);
//			
//		}
//		return count+1; // Add 1 for the current element
//    }
	
	
	
	
	
	
	
	
	
	
	
	private static int solution(int [] arr) {
		if(arr.length==0) {
			return 0;
		}
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int ans =0;
		for(int i : set) {
			
			if(!set.contains(i-1)) {
				int count = 1;
				int x = i;
				while(set.contains(x+1)) {
					
					count++;
					x++;
				}
				ans = Math.max(ans, count);
				
			}
		}
		return ans;
	}
}





