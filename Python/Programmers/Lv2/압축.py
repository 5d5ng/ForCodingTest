def solution(msg):
    answer =[]
    dic = []
    for i in range(26):
        dic.append(chr(ord("A")+i))
    start = 0
    i = 1
    while i<=len(msg):
        if msg[start:i] in dic :
            i+=1
            continue
        else:
            dic.append(msg[start:i])
            answer.append(dic.index(msg[start:i-1])+1)
            start = i-1

    answer.append(dic.index(msg[start:])+1)
    return answer


print(solution("TOBEORNOTTOBEORTOBEORNOT"))
s = "ABABABABABABABAB"
print(s[0:1])



    