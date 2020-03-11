package 스택;

import java.util.*;
import java.io.*;

public class 스택수열 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int present = 1;
        int cntPop = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            while(present+cntPop<=num){
                s.push(present++);
                System.out.println("+");
                sb.append("+\n");
            }

            System.out.println("pre"+present+" num"+num);

            if(present>n) {
                System.out.println("NO");
                System.exit(1);
            }
          present+=cntPop+1;
            while(present>num) {
                System.out.println("-");
                sb.append("-\n");
                present = s.pop();
                cntPop++;
            }



        }
//        System.out.println(sb);

    }
}
