package ����;

import java.util.Scanner;

public class �����̴¿ö󰡰�ʹ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextLong();
		double b = sc.nextLong();
		double v = sc.nextLong();	
		if(v==a) System.out.println(1);
		else {
			long day = (long) Math.ceil((v-a)/(a-b)) +1 ;
			System.out.println(day);	
		}

	}

}
