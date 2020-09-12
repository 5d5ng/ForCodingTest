from itertools import combinations
def solution(orders, course):
    answer = []
    for n in course:
        dic = {}
        maxVal = 0
        for o in orders:
            o = sorted(list(o))
            temp = ""
            for i in o:
                temp+=i
            lst = list(combinations(temp,n))
            for i in lst:
                if dic.get(i) is None:
                    dic[i] = 1
                else:
                    dic[i]+=1
        for val in dic.values():
            maxVal = max(maxVal,val)
        if maxVal>=2:
            for k in dic.keys():
                if dic[k] == maxVal:
                    s = ""
                    for i in list(k):
                        s+=i
                    answer.append(s)

    answer = sorted(answer) 
    return answer
    



    
    # freq = [0 for i in range(26)]
    # for order in orders:
    #     for c in order:
    #         freq[ord(c)-ord("A")]+=1
        
    # print(freq)
    # return freq

orders = ["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"]
course  = [2,3,5]
s = "wernk"
# print(list(combinations(s,2)))

# print(s.sorted(list(s)))
print(solution(orders,course))

