import java.util.*;

public class s3_2_pow_x_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		long n = sc.nextLong();
		System.out.println(String.format("%.5f",solution(x, n)));

	}
//	private static double solution(double x, double n) {
//		if(n == 0) {
//			return 1.0;
//		}
//		return x*solution(x,n-1);
//	}
	
	
	
	private static double solution(double x,long n) {
		long nn = n;
		
//		agar meri power n negative hai to m use posive bna kr answ nikal lunga fir 1/ans kr lunga
		
		if(nn<0) {
			nn = -1*nn;
			
		}
		double ans = 1.0;
		while(nn>0) {
			if(nn%2==0) {
				x=x*x;
				nn/=2;
			}else {
				ans = ans*x;
				nn= nn-1;
			}
		}
//		check kr rha hu agr mera n negative tha to anse 1/ans hoga
		
		if(n<0) {
			return 1/ans;
		}else {
			return ans;
		}
	}

}
