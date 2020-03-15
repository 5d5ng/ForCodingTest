package 스택;

import java.io.*;
import java.util.Stack;

public class 균형잡힌_세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> s = new Stack<Character>();
        String in = "";
        while (true) {
            in = br.readLine();

            if (in.equals(".")) {
                bw.flush();
                bw.close();
                break;
            }
            char[] chars = in.toCharArray();
            for (char c : chars) {
                if (c == '[' || c == '(') {
                    s.push(c);
                } else if (c == ']') {
                    if (s.isEmpty() || s.pop() != '[') {
                        s.add('c');
                        break;
                    }
                } else if (c == ')') {
                    if (s.isEmpty() || s.pop() != '(') {
                        s.add('c');
                        break;
                    }
                }
            }
            if (s.isEmpty()) bw.write("yes\n");
            else bw.write("no\n");
            s.clear();
        }
        br.close();

    }
}
