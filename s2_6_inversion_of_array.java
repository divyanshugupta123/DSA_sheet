import java.util.ArrayList;

public class s2_6_inversion_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = {2,5,1,3,4};
		System.out.println(mergeSort(arr, 0,arr.length-1));

	}
//	private static long getCount(long[] arr,int n) {
//		int c = 0;
//		for(int i = 0;i<arr.length-1;i++) {
//			for(int j = i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					c++;
//				}
//			}
//		}
//		return c;
//	}

	
	
//	i can done this problem using merge sort having time complexity of n logn and the space compexlity of n
	
	
	private static long mergeSort(long[] arr,int low,int high) {
		int c = 0;
		if(low>=high) {
			return c;
		}
		int mid = (low+high)/2;
		c+=mergeSort(arr, low, mid);
		c+=mergeSort(arr, mid+1, high);
		c+=merge(arr, low, mid, high);
		return c;
	}
	private static int merge(long[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> temp = new ArrayList<>(); // temporary array
	        int left = low;      // starting index of left half of arr
	        int right = mid + 1;   // starting index of right half of arr

	        //storing elements in the temporary array in a sorted manner//

	        int c = 0;
	        while (left <= mid && right <= high) {
	            if (arr[left] <= arr[right]) {
	                temp.add((int) arr[left]);
	                left++;
	            } else {
	                temp.add((int) arr[right]);
	                c+=(mid-left+1);
	                right++;
	            }
	        }

	        // if elements on the left half are still left //

	        while (left <= mid) {
	            temp.add((int) arr[left]);
	            left++;
	        }

	        //  if elements on the right half are still left //
	        while (right <= high) {
	            temp.add((int) arr[right]);
	            right++;
	        }

	        // transfering all elements from temporary to arr //
	        for (int i = low; i <= high; i++) {
	            arr[i] = temp.get(i - low);
	        }
	        return c;
	}
	
	
	
	
	
}
