package DFS_BFS;
import java.util.*;
import java.io.*;

class Node {
    LinkedList<Integer> list;
    int data;
    boolean visited;
    int pi ;
    public Node(int data) {
        this.data = data;
        list = new LinkedList<>();
    }
}

public class DFS와BFS {

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
            G[u].list.addFirst(v);
            G[v].list.addFirst(u);
        }
        dfs(G, startD);
    }

    private static void dfs(Node[] G, int start) {
       if(visitedAll(G)){
           return;
       }
       G[start].visited = true;
        System.out.print(start+" ");
       for(int i:G[start].list){
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
