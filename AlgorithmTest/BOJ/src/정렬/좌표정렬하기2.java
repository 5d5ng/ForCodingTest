package 정렬;
import java.io.*;
import java.util.*;

class Point2{
    int x,y;

    public Point2(int x, int y)   {
        this.x = x;
        this.y = y;
    }
}

public class 좌표정렬하기2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Comparator<Point2> com = null;
        ArrayList<Point2> list = new ArrayList<Point2>();
        com = new Comparator<Point2>() {
            @Override
            public int compare(Point2 o1, Point2 o2) {
                if (o1.y > o2.y) return 1;
                else if (o1.y == o2.y) {
                    if (o1.x > o2.x) return 1;
                    else return -1;
                } else return -1;
            }
        };
        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            list.add(new Point2(Integer.parseInt(in[0]), Integer.parseInt(in[1])));
        }
        list.sort(com);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).x+" "+list.get(i).y);
        }

    }

}
