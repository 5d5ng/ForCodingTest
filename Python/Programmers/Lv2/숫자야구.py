def solution(baseball):
    answer = []
    for i in range(1,10):
        for j in range(1,10):
            for k in range(1,10):
                if(i==j or j==k or i==k):
                    pass
                else:
                    answer.append(str(i*100+j*10+k))
    
    for i in baseball:
        for j in range(len(answer)):
            strike = 0
            ball = 0
            for k in range(3):
                if str(i[0])[k] == (answer[j][k]):
                    strike+=1
                elif str(i[0])[k] in (answer[j]):
                    ball+=1
            if strike != int(i[1]) or ball != int(i[2]):
                answer[j] = 0
        answer = list(set(answer))
        if 0 in answer:
            answer.remove(0)
    return len(answer)