package 백트래킹;
import javax.tools.ForwardingFileObject;
import java.io.*;

public class N과M_3 {
    static int n,m;
    static int[] res;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] in = br.readLine().split(" ");
         n = Integer.parseInt(in[0]);
         m = Integer.parseInt(in[1]);
         res = new int [m];
        fun(0);
        bw.close();
    }
    public static void fun(int num) throws IOException {
        if(num == m) {
            for (int i = 0; i < m; i++) {
               // System.out.print(res[i]+" ");
                bw.write(Integer.toString(res[i])+" ");

            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i <=n ; i++) {
            res[num] = i;
            fun(num+1);
        }
    }
}
