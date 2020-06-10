def solution(progresses,speeds):
    lst = []
    ans = []
    for i in range(len(progresses)):
        temp = progresses[i]
        cnt = 0
        while temp<100:
            temp+=speeds[i]
            cnt+=1
        lst.append(cnt)

    while len(lst)!=0:
        temp = lst.pop(0)
        cnt = 1
        while len(lst)>0 and temp>=lst[0]:
            cnt+=1
            lst.pop(0)   
        ans.append(cnt)
    return ans
progresses = [93,30,55]
speeds = [1,30,5]
print(solution(progresses,speeds))