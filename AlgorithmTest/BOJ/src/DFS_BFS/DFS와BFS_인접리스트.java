package DFS_BFS;
import java.util.*;
import java.io.*;

class Node {
    LinkedList<Integer> list;
    int data;
    boolean visited;
    public Node(int data) {
        this.data = data;
        list = new LinkedList<>();
    }
}

public class DFS와BFS_인접리스트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Node[] G = new Node[n + 1];
        int EdgeNum = Integer.parseInt(st.nextToken());
        int startD = Integer.parseInt(st.nextToken());
        for (int i = 1; i <=n; i++) {
            G[i] = new Node(i);
        }
        for (int i = 0; i < EdgeNum; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            G[u].list.add(v);
            G[v].list.add(u);
        }
        for (int i = 1; i <G.length ; i++) {
            Collections.sort(G[i].list);
        }
        dfs(G, startD);
        System.out.println();
        for (int i = 1; i <G.length ; i++) {
            G[i].visited = false;
        }
        bfs(G,startD);
    }

    private static void bfs(Node[] G, int startD) {
        Queue<Integer> q = new LinkedList<>();
        q.add(startD);
        G[startD].visited = true;

        while(!q.isEmpty()){
            int v = q.poll();
            System.out.print(v+" ");
            for(int i:G[v].list){
                if(!G[i].visited){
                    q.add(i);
                    G[i].visited = true;
                }
            }
        }


    }

    private static void dfs(Node[] G, int start) {
       if(visitedAll(G)){
           return;
       }
       G[start].visited = true;
        System.out.print(start+" ");
       for(int  i:G[start].list){
           if(!G[i].visited){
                dfs(G,i);
           }
       }

    }
    static boolean visitedAll(Node []G){
        for (int i = 1; i <G.length ; i++) {
            if(!G[i].visited)
                return false;
        }
        return true;
    }
}
