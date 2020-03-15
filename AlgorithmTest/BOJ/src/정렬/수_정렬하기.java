package 정렬;
import java.util .*;
public class 수_정렬하기 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        for (int last = num.length ; last >= 0; last--) {
            for (int i = 0; i < last - 1; i++) {
                if (num[i] > num[i + 1]) {
                    int tmp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println(num.length);
    }
}

