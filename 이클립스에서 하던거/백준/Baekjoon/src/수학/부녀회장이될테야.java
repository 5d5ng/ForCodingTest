package ����;

import java.util.Scanner;

public class �γ�ȸ���̵��׾� {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		int k = 0, n = 0;
		int res = 1;
		
		for(int i=0;i<T;i++) {
			k = sc.nextInt();
			n = sc.nextInt();
			int [][] arr = new int[k+1][n+1];
			for(int j=1;j<k+1;j++) {
				arr[j][1] = 1;
			}
			for(int m=1;m<n+1;m++)
				arr[0][m]=m; //0�� ����		
			for(int j=1;j<k+1;j++) {
				for(int m=1;m<n+1;m++) {
					arr[j][m] = arr[j-1][m] + arr[j][m-1];
				}
			}				
			System.out.println(arr[k][n]);
		}
		
	}

}
