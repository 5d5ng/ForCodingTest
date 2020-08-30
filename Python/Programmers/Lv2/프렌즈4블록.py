def solution(m,n,board):
    ar = []
    vis = [[0 for i in range(m)] for i in range(n)]
    for i in range(n):
        temp = []
        for j in range(m):
            temp.append(board[j][i])
        ar.append(temp[::-1])
    cnt = 0
    res = 0
    while True:
    
        for i in range(len(ar)-1):
            for j in range(len(ar[i])-1):
                if i+1<len(ar) and j+1<len(ar[i+1]) and (ar[i][j]==ar[i+1][j]==ar[i][j+1]==ar[i+1][j+1]):
                    vis[i][j]+=1
                    vis[i+1][j] += 1
                    vis[i][j+1] += 1
                    vis[i+1][j+1] +=1
                    cnt+=1 
        if cnt==0: break
        #제거
        newAr = []
        for i in range(len(ar)):
            temp = []
            for j in range(len(ar[i])):
                if vis[i][j] == 0:
                    temp.append(ar[i][j])
                else: res+=1
            newAr.append(temp)
        ar = newAr
        cnt = 0
        vis = [[0 for i in range(m)] for i in range(n)]
    return res
    
        


m=4;n=5;
# board = ["TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"]
board =["CCBDE", "AAADE", "AAABF", "CCBBF"]
print(solution(m,n,board))

