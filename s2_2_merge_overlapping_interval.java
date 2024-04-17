import java.util.*;

public class s2_2_merge_overlapping_interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4}};
		solution(arr);
		
	}
	private static List<List<Integer>> solution(int[][]arr){
		Arrays.sort(arr,new Comparator<int[]>() {
			public int compare(int[] a,int[] b) {
				return a[0]-b[0];
			}
		});
		List<List<Integer>> ans = new ArrayList<>();
		for(int i = 0;i<arr.length;i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)) {
				continue;
			}
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j][0]<=end) {
					end= Math.max(end, arr[j][1]);
				}else {
					break;
				}
			}
			ans.add(Arrays.asList(start,end));
		}
		return ans;
	}
}
