

package concepts;

import java.util.*;

public class merge_sort {
	
	
	
//	time complexity for merge sort is n(log n)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,3,5,2,5,7,6,4,0};
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		mergeSort(arr, 0, arr.length-1);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	private static void mergeSort(int [] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		int mid = (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	private static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> temp = new ArrayList<>(); // temporary array
	        int left = low;      // starting index of left half of arr
	        int right = mid + 1;   // starting index of right half of arr

	        //storing elements in the temporary array in a sorted manner//

	        while (left <= mid && right <= high) {
	            if (arr[left] <= arr[right]) {
	                temp.add(arr[left]);
	                left++;
	            } else {
	                temp.add(arr[right]);
	                right++;
	            }
	        }

	        // if elements on the left half are still left //

	        while (left <= mid) {
	            temp.add(arr[left]);
	            left++;
	        }

	        //  if elements on the right half are still left //
	        while (right <= high) {
	            temp.add(arr[right]);
	            right++;
	        }

	        // transfering all elements from temporary to arr //
	        for (int i = low; i <= high; i++) {
	            arr[i] = temp.get(i - low);
	        }
	}

}
