package lv1;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));

        }
    }
}
