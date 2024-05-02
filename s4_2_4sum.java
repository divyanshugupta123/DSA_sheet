import java.util.*;
public class s4_2_4sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,2,2};
		int target = 8;
		List<List<Integer>> ans = solution(arr, target);
		for (List<Integer> sublist : ans) {
            for (Integer num : sublist) {
                System.out.print(num + ",");
            }
            System.out.println();
        }
		
	}
	private static List<List<Integer>> solution(int[] arr,int target){
		Arrays.sort(arr);
		List<List<Integer>> ans = new ArrayList<>();
		HashSet<List<Integer>> set = new HashSet<>();
		for(int i = 0;i<arr.length-3;i++) {
			if(i>0 && arr[i] == arr[i-1]) continue;
			for(int j = i+1;j<arr.length-2;j++) {
				if(j>i+1 && arr[j]==arr[j-1])	continue;
				int k = j+1;
				int l = arr.length-1;
				while(k<l) {
					long sum = arr[i]+arr[j];
					sum+=arr[k];
					sum+=arr[l];
					if(sum>target) {
						l--;
					}else if(sum < target) {
						k++;
					}else {
						List<Integer> temp = new ArrayList<>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						temp.add(arr[l]);
						if(!set.contains(temp)) {
							ans.add(temp);
							set.add(temp);
						}
						
						while(k<l && arr[k]==temp.get(2)) k++;
						while(k<l && arr[k]==temp.get(3)) l--;
					}
				}
			}
		}
		return ans;
	}
	

}
