package 문자열;

import java.util.Scanner;

public class 단어공부 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        int[] alph = new int[26];
        int max = -1;
        int maxIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            int t = (int) str.charAt(i) - (int) 'A';
            alph[t]++;

        }
        for (int i = 0; i < alph.length; i++) {
            if (max < alph[i]) {
                max = alph[i];
                maxIndex = i;
            }
            else if(max == alph[i]){
                maxIndex = '?';
            }

        }
        if(maxIndex != '?') {
            int res = maxIndex + (int) 'A';
            System.out.println((char) res);
        }
        else{
            System.out.println('?');
        }
    }

}
