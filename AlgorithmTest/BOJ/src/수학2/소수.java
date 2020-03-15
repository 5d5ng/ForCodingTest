package 수학2;
import java.io.*;
public class 소수 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE,sum = 0;
        for (int i = m; i <=n ; i++) {
            if(chkPrime(i)){
                sum+=i;
                min = Math.min(i,min);
            }
        }
        if(sum==0) System.out.println(-1);
        else System.out.println(sum+"\n"+min);

    }
    static boolean chkPrime(int num){
        if(num <=1) return false;
        for (int i = 2; i < num ; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
