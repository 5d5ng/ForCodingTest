package ����;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int flag = 6 ,start = 1;
		int ans = 1;
		while(start<N) {
			start+=flag;
			flag+=6;
			ans++;
		}
		System.out.println(ans);
		sc.close();
	}

}
