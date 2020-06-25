def solution (n):
    ans = 0
    lst = [i for i in range(n,0,-1)]
    for i in range(n):
        target = 0
        for j in range(i,n):
            target+=lst[j]
            if target == n:
                ans+=1
                break
            elif target>n:
                break
    return ans

for i in range(1,10,3):
    print(i)


# print(solution(15))