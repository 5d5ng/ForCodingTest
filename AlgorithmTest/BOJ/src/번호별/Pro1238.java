package 번호별;
import java.io.*;
import java.util.*;
class City{
    int num;
    ArrayList<int[]> AdList = new ArrayList<>();
    City(int num){
        this.num = num;
    }
}
public class Pro1238 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken()),m= Integer.parseInt(st.nextToken()),x = Integer.parseInt(st.nextToken());
        City[] list = new City[n+1];
        for (int i = 1; i < n; i++) {
            list[i] = new City(i);
        }
        for (int i = 0; i <m ; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dis = Integer.parseInt(st.nextToken());
            int[] temp = {end,dis};
            list[start].AdList.add(temp);
        }


    }
    static void fun(City[] list,int x){
        for(int i=1;i<list.length;i++) {
            PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1]-o1[2];
                }
            });
            for(int[] temp: list[i].AdList){
                q.add(temp);
            }


        }
    }
}
