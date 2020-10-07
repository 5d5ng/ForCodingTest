n,m = map(int,input().split())
vis = []
def solution(now,vis,m,n):
    if len(vis) == m:
        for i in vis:
            print(i,end=' ')
        print()
        return
    for i in range(1,n+1):
        if not i in vis:
            vis.append(i)
            solution(i+1,vis,m,n)
            vis.pop()
solution(1,vis,m,n)






