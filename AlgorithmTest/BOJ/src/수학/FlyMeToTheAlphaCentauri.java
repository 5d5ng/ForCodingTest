package 수학;
import java.util.Scanner;

public class FlyMeToTheAlphaCentauri {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long T = sc.nextLong();
        int cnt = 0;
        for(int i=0;i<T;i++) {

            long x = sc.nextLong() , y = sc.nextLong();
            long dis = y - x; // 마지막은 1로해야하니까 미리빼둠
            long vel = 1; // 현재 갈 거리
            while(dis>=vel*vel) {
                vel++;
            }
            vel--;
            dis -= vel;
            cnt = (int)vel + ((int)dis/(int)vel);
            if(dis%vel!=0) cnt++;

            System.out.println(cnt);

        }


    }
}