T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
lst = []
for test_case in range(1, T + 1):
    wire = []
    N = int(input())
    for n in range(N):
        v1,v2 = map(int,input().split())
        wire.append([v1,v2])
    res = 0
    for i in range(N-1):
        for j in range(i+1,N):
            if (wire[i][0] - wire[j][0]) * (wire[i][1]-wire[j][1]) < 0:
                res+=1
    lst.append(res)
for i in range(len(lst)):
    print('#{} {}'.format(i+1,lst[i]))
