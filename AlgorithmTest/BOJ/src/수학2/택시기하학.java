package 수학2;
import java.io.*;
public class 택시기하학 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        System.out.println(Uclid(r));
        System.out.println(Taxi(r));

    }
    public static double Taxi(int r){
        return 2.0*Math.pow((double)r,2);
    }
    public static double Uclid(int r){
        return Math.pow((double)r,2)*Math.PI;
    }
}
