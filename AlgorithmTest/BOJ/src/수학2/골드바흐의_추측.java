package 수학2;

import java.io.*;
import java.util.*;

public class 골드바흐의_추측 {
    static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        setPrime(10000);
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int j = 2; j < 10001; j++) {
            if (!prime[j]) {
                primeList.add(j);

            }
        }
        for (int i = 0; i < t; i++) {
            int resx = 100000, resy = 0;
            int n = Integer.parseInt(br.readLine());
            for (int x = 0; x < primeList.size(); x++) {
                for (int y = 0; y < primeList.size(); y++) {
                    int tx =primeList.get(x);
                    int ty = primeList.get(y);
                    if (tx+ty>n)break;
                    else if(tx+ty==n){
                        if(Math.abs(tx-ty)< Math.abs(resx-resy)){
                            resx = tx;
                            resy = ty;
                        }
                    }
                }
            }
            System.out.println(resx + " " + resy);

        }
    }

    static void setPrime(int n) {
        for (int i = 2; i <= n; i++) {
            for (int j = 2; i * j < n + 1; j++) {
                prime[i * j] = true;
            }
        }
    }

}
