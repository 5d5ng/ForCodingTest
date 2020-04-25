package 번호별;

import java.io.*;
import java.util.StringTokenizer;

public class Pro1074 {
    static int r, c;
    static int cnt = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new int[(int) Math.pow(2, n)][(int) Math.pow(2, n)];


    }

    static void fun(int n, int y, int x, int depth) {

        if(depth==n)return;

        visit(y, x);
        fun(n,y,x,depth+1);


    }

    static void visit(int y, int x) {
        for (int i = y; i < y + 2; i++)
            for (int j = x; j < x + 2; j++) {
                if(i==r&&j==c) System.out.println(cnt);
                arr[i][j] = cnt;
                cnt++;
            }
    }
}
