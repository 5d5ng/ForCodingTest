package ����;

import java.util.Scanner;

public class ACMȣ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  T = sc.nextInt();
		int res = 0;
		for(int i=0;i<T;i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();

			int rNum = n/h; //���ȣ ���ڸ� rNum
			if(n%h!=0) rNum++;
			
			int fNum = n%h; //����ȣ
			if (fNum == 0)fNum = h;

			res = 100*fNum+rNum;
			System.out.println(res);

		}

	}

}
