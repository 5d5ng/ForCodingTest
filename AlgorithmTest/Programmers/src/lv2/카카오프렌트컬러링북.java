package lv2;

public class 카카오프렌트컬러링북 {

    public static void main(String[] args) {
            int [][] p = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
            int[] res = solution(6,4,p);
        System.out.println(res[0]+" "+res[1]);
    }

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] > 0 && !vis[i][j]) {
                  numberOfArea++;
                  maxSizeOfOneArea = Math.max( dfs(i, j, vis, picture),maxSizeOfOneArea);
                  cnt = 0;
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    static int cnt = 0;
    private static int dfs(int m, int n, boolean[][] vis, int[][] picture) {
        vis[m][n] = true;
        cnt++;
        int now = picture[m][n];
        if (m + 1 < picture.length && !vis[m + 1][n] && picture[m+1][n] == now) {

            dfs(m+1,n,vis,picture);

        }
        if (n + 1 < picture[0].length && !vis[m][n+1]&& picture[m][n+1] == now) {

            dfs(m,n+1,vis,picture);
        }
        if (m - 1 >=0 && !vis[m-1][n] && picture[m-1][n] == now) {
            dfs(m-1,n,vis,picture);
        }
        if (n - 1 >=0 && !vis[m ][n-1] && picture[m][n-1] == now) {

            dfs(m,n-1,vis,picture);
        }
        return cnt;
    }
}
