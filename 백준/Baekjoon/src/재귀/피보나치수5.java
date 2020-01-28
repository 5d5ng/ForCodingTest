package 재귀;

import java.util.Scanner;

public class 피보나치수5 {

	
	public static void main(String[] args) {
		피보나치수5 app = new 피보나치수5();
		app.process_command();
	}

	private  void process_command() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int ans = fibo(n,0);
//		System.out.println(ans);
		
		int num1 = 0,num2 = 1,num3 = 0;
		for(int i=0;i<n-1;i++) {
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
		
		System.out.println(num3);
		System.out.println(fibo(n,0,1,1));
		
	}
	int fibo(int limit,int n1,int n2,int n3) {
		
		if(limit == 0) {
			return n3;
		}
		else 
			return fibo(limit-1,n2,n3,n1+n2)+fibo(limit-2,n2,n3,n1+n2);
		
		
		
		
	}

}
