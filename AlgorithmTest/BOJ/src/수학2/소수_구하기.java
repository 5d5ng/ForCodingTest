package 수학2;
import java.io.*;
public class 소수_구하기 {
    public static boolean[] primeNum;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] in  =br.readLine().split(" ");
        int m = Integer.parseInt(in[0]);
        int n = Integer.parseInt(in[1]);
        primeNum = new boolean[n+1];
        getPrimeNum();
        for(int i=m;i<=n;i++){
            if(!primeNum[i]){
               sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
    private static void getPrimeNum() { //에라토스테네스의 체
        primeNum[1] = true;
        for(int i=2;i<primeNum.length;i++)
            for (int j = 2; i*j <primeNum.length ; j++) {
                primeNum[i*j] = true;
            }
    }

}
