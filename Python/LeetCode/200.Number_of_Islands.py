from typing import List


class Solution:
    def numIslands(self, grid: List[List[str]]) -> str:
        vis = [[0 for _ in range(len(grid[0]))] for i in range(len(grid))]

        def dfs(y, x, vis, grid):
            vis[y][x] = 1
            if y - 1 >= 0  and vis[y - 1][x] == 0 and grid[y - 1][x] == "1":
                dfs(y - 1, x , vis, grid)
            if y + 1 < len(vis) and vis[y + 1][x] == 0 and grid[y + 1][x] == "1":
                dfs(y + 1, x, vis, grid)
            if x + 1 < len(vis[0]) and vis[y][x + 1] == 0 and grid[y][x + 1] == "1":
                dfs(y, x + 1, vis, grid)
            if  x - 1 >= 0 and vis[y][x - 1] == 0 and grid[y][x - 1] == "1":
                dfs(y, x - 1, vis, grid)
        res = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if vis[i][j] == 0 and grid[i][j] == "1":
                    dfs(i, j, vis, grid)
                    res += 1
        return res
    def numIslands2(self,grid: List[List[str]])->str:
        vis = [[0 for _ in range(len(grid[0])) ] for i in range(len(grid)) ]

        def bfs(y,x,vis,grid):
            dir = [(0,1),(1,0),(-1,0),(0,-1)]
            q = []
            q.append((y,x))
            vis[y][x] = 1
            while q:
                curr = q.pop(0)
                for d in dir:
                    flag_y = curr[0] + d[0]
                    flag_x = curr[1] + d[1]
                    if 0 <= flag_x < len(grid[0]) and 0 <= flag_y < len(grid) and vis[flag_y][flag_x]==0 and grid[flag_y][flag_x] == "1":
                        q.append((flag_y,flag_x))
                        vis[flag_y][flag_x]=1
        res = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if vis[i][j] == 0  and grid[i][j] == "1":
                    bfs(i,j,vis,grid)
                    res+=1
        return res

    def numIslands3(self,grid:List[List[str]])->str:
        def dfs(i,j):
            if i<0 or i >= len(grid) or j < 0 or j>= len(grid[0]) or grid[i][j] != "1":
                return
            grid[i][j] = 0 #다시 포함시키지 않기위해 1 에서 다른 것으로 변경해준다. vis 대타
            dfs(i+1,j)
            dfs(i-1,j)
            dfs(i,j+1)
            dfs(i,j-1)

        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == "1":
                    dfs(i,j)
                    count+=1
        return count








app = Solution()
grid = [
    ["1", "1", "1", "1", "0"],
    ["1", "1", "0", "1", "0"],
    ["1", "1", "0", "0", "0"],
    ["0", "0", "0", "0", "0"]
]
print(app.numIslands2(grid))
