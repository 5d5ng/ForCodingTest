package 수학2;
import java.io.*;
public class 베르트랑공준 {
    static boolean [] prime;

    public static int countPrime(int n){
        int cnt = 0;
        prime = new boolean[2*n+1];
        for (int i = 2; i <= 2*n ; i++) {
            for (int j = 2; i*j <= 2*n ; j++) {
                prime[i*j] = true;
            }
        }
        for (int i = n+1; i <=2*n; i++) {
            if(!prime[i])cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int num = -1;
        while(true){
            num = Integer.parseInt(br.readLine());
            if(num==0) break;
            System.out.println(countPrime(num));

        }
    }
}
