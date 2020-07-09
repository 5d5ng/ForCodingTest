
# 백트래킹을 이용한 풀이
# global maxV
# maxV = 0
# def solution(land):
#   backT(land,0,0,0)
#   return maxV

# def backT(land,depth,val,now):
#   if depth == len(land):
#     global maxV 
#     maxV= max(maxV,val) 
#     return
#   for i in range(len(land[0])):
#     if i != now:
#       backT(land,depth+1,val+land[depth][i],i)

#동적계획법
def solution(land):
  dp = [ [0 for i in range(len(land[0])) ] for j in range(len(land)) ]  
  ans = -1
  temp = -1
  for i in range(len(land)): # 행
    for j in range(len(dp[0])): # 열
      for k in range(len(dp[0])):
        if k!=j:
          temp = max(temp,dp[i-1][k])
      dp[i][j] = temp + land[i][j]
      temp = 0
  for i in dp[len(dp)-1]:
    ans = max(ans,i)
  return ans




l = [[1,2,3,5],[5,6,7,8],[4,3,2,1]]

# solution(l)
lst = [1,2,3,4,5]
sum = 0
for i in range(len(lst)):
  print(lst[:i] + lst)







