package lev3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String [] cases = new String[T];
		for(int i=0;i<T;i++) {
			cases[i] = sc.next();
			System.out.println(cases[i]);
		}

	}

}
