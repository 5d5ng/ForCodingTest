package 정렬;
import java.io.*;
import java.util.*;
class Point{
    int x,y;

    public Point(int x, int y)   {
        this.x = x;
        this.y = y;
    }
}
public class 좌표정렬하기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Comparator<Point> com = null;
        ArrayList<Point> list = new ArrayList<Point>();
        com = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.x > o2.x) return 1;
                else if (o1.x == o2.x) {
                    if (o1.y > o2.y) return 1;
                    else return -1;
                } else return -1;
            }
        };
        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            list.add(new Point(Integer.parseInt(in[0]), Integer.parseInt(in[1])));
        }
        list.sort(com);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).x+" "+list.get(i).y);
        }

    }

}
