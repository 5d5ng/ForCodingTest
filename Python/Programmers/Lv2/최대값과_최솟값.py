def solution(s):
    s = s.split(" ")
    Max = int(s[0])
    Min = int(s[0])
    for i in s:
        Max=max(Max,int(i))
        Min = min(Min,int(i))

    return str(Min)+' '+str(Max)

print(solution('-1 -2 3 4'))

#다른 풀이
def solution2(s):
    s = list(map(int,s.split()))
    return str(min(s)+" "+max(s))