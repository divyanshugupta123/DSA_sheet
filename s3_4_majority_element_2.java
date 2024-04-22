import java.util.*;;
public class s3_4_majority_element_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,0};
		List<Integer> ans = solution(arr);
		for(int i = 0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
		
	}
//	private static List<Integer> solution(int[] arr){
//		List<Integer> ans = new ArrayList<>();
//		int orle = arr.length/3;
//		int c;
//		if(arr.length == 1) {
//			ans.add(arr[0]);
////			ans.add(arr[1]);
//		}
//		else if(arr.length ==2 && arr[0]!=arr[1]) {
//			ans.add(arr[0]);
//			ans.add(arr[1]);
//		}
//		else {
//			for(int i = 0;i<arr.length-1;i++) {
//				c = 1;
//				for(int j = i+1;j<arr.length;j++) {
//					if(arr[i] == arr[j]) {
//						c++;
//					}
//					
//				}
//				if (c > orle && !ans.contains(arr[i])) {
//	                ans.add(arr[i]);
//	            }
//			}
//		
//		return ans;
//		}
//		return ans;
//		}
//		
	
	
	
	private static List<Integer> solution(int[] arr){
		List<Integer> ans = new ArrayList<>();
		int c1 = 0,c2=0,ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++ ) {
			if(c1==0 && ele2!=arr[i]) {
				c1=1;
				ele1 = arr[i];
			}else if(c2==0 && ele1!=arr[i]) {
				c2 = 1;
				ele2 = arr[i];
			}
			else if(arr[i] == ele1) {
				c1++;
			}else if(arr[i] == ele2) {
				c2++;
			}else {
				c1--;c2--;
			}
		}
		int cn1 =0,cn2=0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == ele1) cn1++;
			if(arr[i] == ele2) cn2++;
		}
		int count = arr.length/3;
		if(cn1>count) ans.add(ele1);
		if(cn2>count) ans.add(ele2);
		return ans;
	}

}
