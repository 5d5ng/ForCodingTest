package ����;

import java.util.Scanner;

public class ������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int res = -1;
		int N = sc.nextInt();
		int limit = N/3 + 1;
		for(int i=0 ;res==-1 && i<limit;i++) {
			for(int j=limit;j>=0;j--) {
				if(3*i+5*j == N) {
					res = i+j;
					break;
				}
			}
		}
		System.out.println(res);
	}

}
