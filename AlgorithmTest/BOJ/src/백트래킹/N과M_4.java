package 백트래킹;
import java.io.*;
public class N과M_4 {
    static int n,m;
    static int[] res;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        String[] in = br.readLine().split(" ");
        n = Integer.parseInt(in[0]);
        m = Integer.parseInt(in[1]);
        res = new int[m];
        fun(0);
        System.out.println(sb);
    }
    public static void fun(int num){
        if(num == m){
            if(isValid()){
                for(int i=0;i<m;i++)
                {
                    sb.append(res[i]+" ");
                }
                sb.append("\n");
            }
            return;
        }
        for (int i = 1; i <= n ; i++) {
            res[num] = i;
            fun(num+1);
        }
    }
    public static boolean isValid(){
        for (int i = 0; i < res.length -1 ; i++) {
            if(res[i]>res[i+1]) return false;
        }
        return  true;
    }

}
