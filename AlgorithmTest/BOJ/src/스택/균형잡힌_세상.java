package 스택;

import java.io.*;
import java.util.Stack;

public class 균형잡힌_세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        Stack<Character> s = new Stack<Character>();
        String in = "";
        while(true){
            in = br.readLine();
            if(in.equals("."))break;
            char [] chars = in.toCharArray();
            for(char c:chars){
                if(s.isEmpty()&&(c==']'||c==')')){
                    s.add(c);
                    break;
                }
                else if(c == '['|| c=='('){
                    s.add(c);
                }
                else if (c==']'&&s.peek()=='['){
                    s.pop();
                }
                else if(c==')'&&s.peek()=='('){
                    s.pop();
                }
            }
            if(s.isEmpty()) System.out.println("yes");
            else System.out.println("no");
            s.clear();
        }
        br.close();

    }
}
