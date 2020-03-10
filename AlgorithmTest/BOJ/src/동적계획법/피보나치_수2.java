package 동적계획법;
import java.io.*;
public class 피보나치_수2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long f0 = 0 ,f1 = 1,f2 = 1;
        for (int i = 2; i <=n; i++) {
            f2 = f0+f1;
            f0 = f1;
            f1 = f2;
        }
        System.out.println(f2);
    }
}
