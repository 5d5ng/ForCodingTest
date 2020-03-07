package 백트래킹;
import java.util.*;
class Node{
    int x;
    int y;
    Node(int x, int y){
        this.x=x;
        this.y=y;
    }
}
public class 스도쿠_정답 {
    static boolean [][] chk_col = new boolean[9][10]; // 행
    static boolean [][] chk_row = new boolean[9][10]; // 열
    static boolean [][] chk_box = new boolean[9][10]; // 3x3박스검사
    public static boolean sd(int[][] arr,int count,ArrayList<Node> nodes,int idx){
        if(idx>=count){
            for(int i=0;i<9;i++){
                for (int j = 0; j < 9; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            return true;
        }
        Node node = nodes.get(idx);
        for (int i = 1; i <=9 ; i++) { //1부터 9까지 모든 경우
            if(chk_col[node.x][i])
                continue;
            if(chk_row[node.y][i])
                continue;
            if(chk_box[(node.x/3)*3+(node.y)/3][i]) //3x3을 하나의 열로 저장해둔것
                continue;

            chk_col[node.x][i] = true;
            chk_row[node.y][i] = true;
            chk_box[(node.x/3)*3+(node.y)/3][i]=true;
            arr[node.x][node.y] = i;
            if(sd(arr,count,nodes,idx+1))
                return true; //탐색종료

            arr[node.x][node.y] = 0;//이전으로 돌려놓기
            chk_col[node.x][i] = false;
            chk_row[node.y][i] = false;
            chk_box[(node.x/3)*3+(node.y)/3][i]=false;

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[][] sd=new int[9][9];

        int count=0;
        ArrayList<Node> nodes=new ArrayList<Node>();
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                sd[i][j]=scan.nextInt();
                if(sd[i][j]==0) {
                    count++;
                    nodes.add(new Node(i,j));
                }
                else {
                    chk_col[i][sd[i][j]]=true;
                    chk_row[j][sd[i][j]]=true;
                    chk_box[(i/3)*3+(j/3)][sd[i][j]]=true;
                }
            }
        }
        sd(sd, count, nodes, 0);
    }
}
