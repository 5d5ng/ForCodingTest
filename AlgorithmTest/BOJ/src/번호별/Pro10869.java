package 번호별;
import java.io.*;
import java.util.StringTokenizer;

public class Pro10869 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken()), n2 = Integer.parseInt(st.nextToken());
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/n2);
        System.out.println(n1%n2);
    }
}
