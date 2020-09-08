def solution(files):
    answer = []
    splitfiles = []
    for name in files:
        idx = idxNum(name)
        templst = []
        templst.append(name[:idx[0]])
        if(len(idx)==1):
            templst.append(name[idx[0]:])
        else:
            templst.append(name[idx[0]:idx[1]])
            templst.append(name[idx[1]:])
            
        splitfiles.append(templst)
    splitfiles = sorted(splitfiles,key=lambda lst: (lst[0].lower(),int(lst[1])) )

    for word in splitfiles:
        temp = ""
        for s in word:
            temp+=s
        answer.append(temp)
    
    return answer

def idxNum(s):
    flag = 0
    res = []
    for i in range(len(s)):
        if flag==0 and s[i].isdigit():
            flag = 1
            res.append(i)
        if flag==1 and s[i].isalpha():
            res.append(i-1)
            return res
    return res


s = ["img12", "img10", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"]
# for i,j in enumerate(s):
#     print(i)
#     print(j)
# print(solution(s))
ss = "sfds1"
# print(ss[3:])

import re
print(re.findall('\d',ss))


