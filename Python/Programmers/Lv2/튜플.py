def solution(s):
    ans = []
    s = s[2:-2]
    lst = s.split("},{")
    numlst = []
    for strr in lst:
        temp = strr.split(",")
        numlst.append(temp)
    numlst.sort(key=len)

    for i in numlst:
        for target in i:
            if not target in ans:
                ans.append(target)
    ans = list(map(int,ans))

    return ans

s = "{{1,2,3},{2,1},{1,2,4,3},{2}}"
import re
m=re.findall("\d+",s)
print(m)
