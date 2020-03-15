package 수학2;

import java.io.*;

public class 네번째점 {
    static class P{
        int x,y;
        boolean chk = true;
         P(int x,int y){
            this.x = x;
            this.y = y;
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] in;
        P [] p = new P[3];
        for (int i = 0; i < 3; i++) {
            in = br.readLine().split(" ");
            p[i] = new P(Integer.parseInt(in[0]),Integer.parseInt(in[1]));
        }

        if(p[0].x==p[1].x){
            System.out.print(p[2].x+" ");
        }
        else if(p[0].x == p[2].x)
            System.out.print(p[1].x+" ");
        else
            System.out.print(p[0].x+" ");

        if(p[0].y==p[1].y){
            System.out.println(p[2].y);
        }
        else if(p[0].y == p[2].y)
            System.out.println(p[1].y);
        else
            System.out.println(p[0].y);

    }
}
