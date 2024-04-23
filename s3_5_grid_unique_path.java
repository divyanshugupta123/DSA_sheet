import java.util.*;
public class s3_5_grid_unique_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(solution(m, n));
		
	}
	
	
//	this gives me the time limit exceeds so we can do this using DP also but that is also not optimised due to space ccomplexity of n2
	
	
//	so we use the basic mathematics explained in notebook
	
	
//	private static int solution(int i,int j,int m , int n) {
//		
//		int c = 0;
//		if(i==m-1 && j == n-1) {
//			return 1;
//		}
//		if(i==m|| j==n) {
//			return 0;
//		}
//			
//			
//		c+=solution(i+1,j,m,n);
//		c+=solution(i,j+1,m,n);
//		
//		
//		return c;
//		
//	}
	
	
	
	
	
	private static int solution(int m,int n) {
		int total_step = m+n-2;
		double res = 1;
		for (int i = 1; i <= m-1; i++)
            res = res * (total_step - (m-1) + i) / i;
		 return (int) res;
	}
	
	
	
	
	
	
	
	
	
	
	

}
