def solution(clothes):
    lst = {}
    for cloth in clothes:
        if cloth[1] in lst: lst[cloth[1]]+=1
        else:
            lst[cloth[1]]=1

    cnt = 1
    for i in lst.values():
        cnt *=(i+1)
    return cnt-1

