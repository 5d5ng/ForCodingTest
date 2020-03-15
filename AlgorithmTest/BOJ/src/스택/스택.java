package 스택;

import java.io.*;
import java.util.*;

public class 스택 {
    static Stack<Integer> s =  new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        String in;
        for (int i = 0; i < n; i++) {
            st= new StringTokenizer(br.readLine());
            in = st.nextToken();
            switch (in) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    s.push(num);
                    break;
                case "top":
                    if (s.isEmpty()) System.out.println(-1);
                    else System.out.println(s.peek());
                    break;
                case "size":
                    System.out.println(s.size());
                    break;
                case "empty":
                    if (s.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "pop":
                    if (s.isEmpty()) {
                        System.out.println(-1);
                    } else System.out.println(s.pop());
                    break;
            }

        }
    }
}
