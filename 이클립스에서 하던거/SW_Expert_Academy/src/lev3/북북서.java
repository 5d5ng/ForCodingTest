package lev3;

import java.util.*;
public class ºÏºÏ¼­ {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		String N = "north";
		String W = "west";

		int Ncnt = 0;

		T = sc.nextInt();
		
		String []cases = new String[T];
		//		for(int i=0;i<T;i++)
		
		for(int i=0;i<T;i++) {
			cases[i] = sc.next();
			double start = 0;
			int j = 0;
			int chk = 0;
			double val = 1;
			while(!(cases[i].equals(W)||cases[i].equals(N)) ) {
				chk=1;
				String temp1 = cases[i].substring(cases[i].length()-4, cases[i].length());
				if(temp1.equals(W)) {

					cases[i]=cases[i].substring(0, cases[i].length()- temp1.length());
					if(j==0) {
						start = 90;
						j++;
					}
					else {
						val*=2;
						start += 90/val;
					}
					Ncnt++;
					continue;
				}
				temp1 = cases[i].substring(cases[i].length()-5, cases[i].length());
				if(temp1.equals(N)) {
					cases[i]=cases[i].substring(0, cases[i].length()- temp1.length());
					if(j==0) {
						start = 0;
						j++;
					}
					else {
						val*=2;
						start -= 90/val;
					}
					Ncnt++;
					continue;
				}
			j++;
			}
			val*=2;
			if(cases[i].length()==4) {
				if(chk==1)
					start +=90/val;
				else
					start = 90;
			}
			else {
				if(chk==1)
					start -=90/val;
				else
					start = 0;
			}
			System.out.println("#"+(i+1)+" "+start);

		}



	}


}
