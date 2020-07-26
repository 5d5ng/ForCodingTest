def solution(A):
  ans = 0
  vis = [ [0 for i in range(len(A[0]))] for j in range(len(A)) ]
  for i in range(len(A)):
    for j in range(len(A[0])):
      if vis[i][j] == 0:
        ans +=1
        dfs(vis,A,i,j,A[i][j])
  return ans
        
def dfs(visit,A,y,x,color):
  visit[y][x] = 1
  if y-1>=0 and visit[y-1][x] == 0 and color==A[y-1][x]:
    dfs(visit,A,y-1,x,color)
  if y+1<len(A) and visit[y+1][x] == 0 and color == A[y+1][x]:
    dfs(visit,A,y+1,x,color)
  if  x-1>=0 and visit[y][x-1] == 0 and color==A[y][x-1]:
    dfs(visit,A,y,x-1,color)
  if x+1<len(A[0]) and visit[y][x+1] == 0 and color==A[y][x+1]:
    dfs(visit,A,y,x+1,color)
  

A = [[5,4,4],[4,3,4],[3,2,4],[2,2,2],[3,3,4],[1,4,4],[4,1,1]]
solution(A)