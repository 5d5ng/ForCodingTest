package 수학2;
import java.io.*;
public class 터렛 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] in;
        int x1 = 0, y1 = 0, r1 = 0;
        int x2 = 0, y2 = 0, r2 = 0;

        for (int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            x1 = Integer.parseInt(in[0]);
            y1 = Integer.parseInt(in[1]);
            r1 = Integer.parseInt(in[2]);
            x2 = Integer.parseInt(in[3]);
            y2 = Integer.parseInt(in[4]);
            r2 = Integer.parseInt(in[5]);
            double dis = DistanceCenter(x1, y1, x2, y2);
            if (dis == 0) {
                if (r1 == r2) System.out.println(-1);
                else System.out.println(0);
            } else if (dis < (double) r1 + (double) r2) {
                if ((double) r1 + dis == (double) r2 || (double) r2 + dis == (double) r1)
                    System.out.println(1);
                else if ((double) r1 + dis < (double) r2 || (double) r2 + dis <(double) r1)
                    System.out.println(0);
                else
                    System.out.println(2);
            } else if (dis == (double) r1 + (double) r2) System.out.println(1);
            else System.out.println(0);
        }


    }

    static double DistanceCenter(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
    }

}
