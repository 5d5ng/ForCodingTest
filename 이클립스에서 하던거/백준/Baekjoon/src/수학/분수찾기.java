package ����;

import java.util.Scanner;

public class �м�ã�� {

	public static void main(String[] args) {

		int flag = 2; //1/1�϶� ���� �и����� 2�̹Ƿ� 2�ν���
		int cnt =0 ,num1=0,num2=0; // �ݺ�Ƚ���� �̿��� x��°���� �ݺ� num1,num2�� �и� ���ڰ� �� ��
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int chk = 1; //���ڸ� ���°��� �и� ���°��� �Ǵ� �ϳ��� ���� ������ 
		//������ �� ���� �и��� ������ ��ȭ ������ -1�� ������
		while(num1==0 ) {
			for(int i=1;i<flag;i++) {
				cnt++;
				if(cnt==x) { //x��°�� �����ϸ�?
					num1 = i;
					num2 = flag-i;
					break;
				}			
			}
			chk*=(-1);
			flag++;
		}
		if(chk>0) {
			System.out.println(num1+"/"+num2);
		}
		else {
			System.out.println(num2+"/"+num1);
		}
		
		
		sc.close();
	}

}
