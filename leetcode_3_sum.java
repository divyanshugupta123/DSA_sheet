import java.util.*;

public class leetcode_3_sum {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = solution(arr);
        for (List<Integer> sublist : ans) {
            for (Integer num : sublist) {
                System.out.print(num + ",");
            }
            System.out.println();
        }
    }

//    private static List<List<Integer>> solution(int[] arr) {
//        HashSet<List<Integer>> set = new HashSet<>();
//        List<List<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < arr.length - 2; i++) {
//            for (int j = i + 1; j < arr.length - 1; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    List<Integer> temp = new ArrayList<>();
//                    if (arr[i] + arr[j] + arr[k] == 0) {
//                        temp.add(arr[i]);
//                        temp.add(arr[j]);
//                        temp.add(arr[k]);
//                        Collections.sort(temp);
//                        set.add(temp);
//                    }
//                }
//            }
//        }
//        ans.addAll(set);
//        return ans;
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private static List<List<Integer>> solution(int[] arr){
    	Arrays.sort(arr);
    	List<List<Integer>> ll = new ArrayList<>();
    	for(int i = 0;i<arr.length-2;i++) {
    		if(i>0 && arr[i]==arr[i-1]) continue;
    		int j = i+1;
    		int k = arr.length-1;
    		while(j<k) {
    			if(arr[i]+arr[j]+arr[k]<0) {
        			j++;
        		}else if(arr[i]+arr[j]+arr[k]>0) {
        			k--;
        		}else {
        			List<Integer> temp = new ArrayList<>();
        			temp.add(arr[i]);
        			temp.add(arr[j]);
        			temp.add(arr[k]);
        			ll.add(temp);
        			j++;
        			k--;
        		}
    		}
    		
    		
    	}
    	
    	
    	return ll;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
