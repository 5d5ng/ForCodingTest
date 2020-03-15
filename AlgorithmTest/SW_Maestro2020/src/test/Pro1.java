package test;

import java.util.*;
import java.io.*;
public class Pro1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String res = "";
        if(n%2==0){
            for (int i = 0; i <n/2 ; i++) {
                res+="1";
            }
        }
        else {
            if(n>3){
                n=n-3;
                res ="7";
                for (int i = 0; i <n/2 ; i++) {
                    res+="1";
                }
            }
            else if(n==3)res="7";
        }
        System.out.println(res);
    }

}
