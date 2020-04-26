package DFS_BFS;
import java.io.*;
import java.util.*;
public class 숨바꼭질 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[] vis = new boolean[100000+1];
        int[] hop = new int[100001];
        Queue<Integer> q = new LinkedList<>();

        int ans = bfs(0,q,vis,hop,n,k);
        System.out.println(ans);
    }
    static int bfs(int res,Queue<Integer> q,boolean[] vis,int[] hop,int n,int k ){
        int present = n;
        q.add(n);
        vis[n] = true;
        while(!q.isEmpty()  )
        {
            present = q.poll();
            if(present == k){
                return hop[present];
            }
            res++;


            if(present+1<vis.length && !vis[present+1]){
                hop[present+1] = hop[present]+1;
                vis[present+1] = true;
                q.add(present+1);
            }
            if(present-1>=0 && !vis[present-1]){
                hop[present-1] = hop[present]+1;
                vis[present-1] = true;
                q.add(present-1);
            }
            if(present*2<vis.length && !vis[present*2]){
                hop[present*2] = hop[present]+1;
                vis[present*2] = true;
                q.add(present*2);
            }


        }
        return res;
    }
}
