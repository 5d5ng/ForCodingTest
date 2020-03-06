package 스택;

import java.io.*;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String in = br.readLine();
            char[] chars = in.toCharArray();
            for (char c : chars) {
                if(s.isEmpty()&& c==')'){
                    s.add(c);
                    break;
                }
                else if (c == '(')
                    s.add(c);
                else if(c==')')
                    s.pop();
            }
            if(s.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
            s.clear();
        }
        br.close();
    }
}
