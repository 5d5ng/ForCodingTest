package lv2;

import sun.java2d.pipe.SolidTextRenderer;

import java.util.*;
import java.io.*;

public class 소수찾기 {
    static boolean[] prime;

    public static void main(String[] args) {

        int n = solution("17");
        System.out.println(n);
    }

    static boolean[] visit;
    static HashSet<Integer> set = new HashSet<>();

    public static int solution(String numbers) {
        String[] nums = numbers.split("");
        visit = new boolean[nums.length];
        fun(nums, 0, "");
        return set.size();
    }

    static void fun(String[] strs, int depth, String s) {

        if (strs.length == depth) {
            return;
        }
        for (int i = 0; i < strs.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                if (isPrime(Integer.parseInt(s + strs[i]))) {
                    set.add(Integer.parseInt(s + strs[i]));
                }
                fun(strs, depth + 1, s + strs[i]);
                visit[i] = false;
            }
        }

    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
