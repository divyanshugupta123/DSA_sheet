
public class s3_1_search_in_a_2d_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(hasElement(arr,69));
	}
	private static boolean hasElement(int[][] arr,int tar) {
//		m apne 2D array ko change krunga 1D array m or fir uspr binary search lga dunga jisse uski complexity O(log(m*n)) aajaegi
		
		int low = 0;int high = (arr.length*arr[0].length-1);
		while(low<=high) {
			int mid = (low+high)/2;
			int row = mid/arr[0].length;
			int col = mid%arr[0].length;
			
			if(arr[row][col]==tar) {
				return true;
			}else if(arr[row][col] > tar) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return false;
	}

}
