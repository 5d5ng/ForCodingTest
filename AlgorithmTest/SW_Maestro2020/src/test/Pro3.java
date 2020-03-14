package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Pro3 {
    static int n, k;
    static int[] co;
    static int[] ar;
    static boolean[] vis;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        ar = new int[n];
        co = new int[k + 1];
        vis = new boolean[k + 1];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        LinkedList<Integer> l = new LinkedList<>();
        combination(l, n, k, 0);
        System.out.println(min);


    }

    private static void combination(LinkedList<Integer> list, int n, int r, int index) {
        if (r == 0) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
            int sum = 0;
            int start = list.get(1);
            for (int i = 2; i < list.size()-1; i++) {
              if(list.get(i)-start>1){
                  sum+=ar[list.get(i)-1] - ar[start];
              }
            }
            start = list.get(k-1);
            sum+=ar[n-1]-ar[start];
            System.out.println(sum);
            min = Math.min(sum,min);

            return;
        }
        if (index == n) return;

        list.add(index);
        combination(list, n, r - 1, index + 1);
        list.removeLast();
        combination(list, n, r, index + 1);//안뽑았으니, r
    }

}
