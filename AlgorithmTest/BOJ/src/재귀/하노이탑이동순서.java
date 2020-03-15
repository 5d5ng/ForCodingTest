package 재귀;

import java.util.Scanner;

public class 하노이탑이동순서 {
    public static int cnt = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        hanoi2(1,2,3,sb,n);
        System.out.println(cnt);
        System.out.println(sb);

    }
    public static void hanoi2(int from, int temp, int to, StringBuilder sb, int n) {
        cnt++;
        if (n == 1) { //1번기둥 원반이 하나이면 바로 3번기둥으로 옮긴다. 그리고 종료
            sb.append(from + " " + to+"\n");
            return;
        }
        hanoi2(from, to, temp, sb, n - 1); //N-1 개의 원반을 기둥 3을 거쳐서 (거치기 때문에 기둥3이 temp역할) 기둥2로 옮긴다 (가장 큰 것을 제외한 나머지 원반을 임시 기둥에 놓는것)
        sb.append(from + " " + to+"\n");// 기둥 1에서 1개의 원반을 기둥 3으로 옮긴다. (가장 큰 원반을 옮기는 것)
        hanoi2(temp, from, to, sb, n - 1);// 기둥 2에서 N-1개의 원반을 기둥 3으로 옮긴다. (나머지 원반을 옮기는 것)
    }
    //기본적인 하노이탑 알고리즘

    public static void hanoi(int from, int temp, int to, int n) {
        if (n == 1) {
            System.out.println(from + " " + to);
            return;
        }
        hanoi(from, to, temp, n - 1); //N-1 개의 원반을 기둥 3을 거쳐서 (거치기 때문에 기둥3이 temp역할) 기둥2로 옮긴다 (가장 큰 것을 제외한 나머지 원반을 임시 기둥에 놓는것)
        System.out.println(from + " " + to); // 기둥 1에서 1개의 원반을 기둥 3으로 옮긴다. (가장 큰 원반을 옮기는 것)
        hanoi(temp, from, to, n - 1); // 기둥 2에서 N-1개의 원반을 기둥 3으로 옮긴다. (나머지 원반을 옮기는 것)
    }
    //하노이 탑 알고리즘
    // 1. 원반 개수가 1이면 기둥 1에서 기둥 3으로 옮기고 종료
    // 2. 원반 개수가 n개일때
    //1. 1번기둥에 있는 n-1개 원반을 2번기둥으로 옮겨야함 이 떄 3번을 거쳐서 옮긴다
    //2. 1번기둥에 남아있는 가장 큰 원반 1개를 3번기둥으로 옮김
    //3. 2번기둥에 놔뒀던 n-1개의 원반들을 3번기둥으로 옮김

    //StringBuilder 사용법에 대해 배움
}
