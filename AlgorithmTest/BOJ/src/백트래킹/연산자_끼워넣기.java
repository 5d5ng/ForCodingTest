package 백트래킹;
import java.io.*;

public class 연산자_끼워넣기 {
    static int n;
    static int[] op = new int[4];
    static int[] num;
    static int  max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = new int[n];
        String[] in = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(in[i]);
        }
        in = br.readLine().split(" ");
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(in[i]);
        }
        fun(1,num[0]);
        System.out.println(max);
        System.out.println(min);
        br.close();
    }
    public static void fun(int depth,int ans){
        if(depth == n){
            max = Math.max(ans,max);
            min = Math.min(ans,min);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if(op[i]>0){
                op[i]--;
                if(i==0){
                    fun(depth+1,ans+num[depth]);
                }
                else if(i==1){
                    fun(depth+1,ans-num[depth]);
                }
                else if(i==2){
                    fun(depth+1,ans*num[depth]);
                }
                else {
                    fun(depth+1,ans/num[depth]);
                }
                op[i]++;
            }
        }
    }


}
