package samsung;

import java.util.*;
public class Επ»η {
	int[] chk;
	int max =0 ;
	public static void main(String[] args) {
		int n;
		Επ»η app = new Επ»η();
		Scanner sc = new Scanner(System.in);		
		n = sc.nextInt();
//		n=10;
		app.chk = new int[n];
		int [] t = new int[n];
		int [] p = new int[n];
		int [] accum = new int[n];
		
//		int [] t = {1,1,1,1,1,1,1,1,1,1};
//		int [] p = {1,2,3,4,5,6,7,8,9,10};
//		int res = app.bfs(t,p,0,n,0);
		for(int i=0;i<n;i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
			
			accum[i] = p[i];
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(i>=t[j]+j) {
					accum[i] = Math.max(p[i]+accum[j], accum[i]);
				}
			}
		}
		int max = 0;
		for(int i=0;i<n;i++) {
			if(i+t[i]<n+1) {
				if(max<accum[i]) {
					max = accum[i];
				}
			}
		}
		System.out.println(max);
	}	
	
private  int bfs(int [] t,int [] p,int start,int n,int val ) {
	if(start+t[start]>=n) {		
		return val;
	}
		
	else {
		for(int i=0;i<n;i++) {
//			System.out.println(start);
		int temp = bfs(t,p,start+t[start],n,val+p[start]);
//		System.out.println(max);
		if(temp>max) max = temp;
		}
		
	 return max;
	}		
}

}
