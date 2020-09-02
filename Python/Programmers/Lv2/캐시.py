def solution(casheSize,cities):
    for i in range(len(cities)):
        cities[i]=cities[i].lower()
    res = 0
    cash = []
    size = min(casheSize,len(cities))
    buf = 0
    i = 0
    while buf!=size and i<len(cities):
        if  cities[i] in cash:
            res+=1
        else:
            cash.append(cities[i])
            res+=5
            buf+=1
        i+=1
    
    for idx in range(i,len(cities)):
        if cities[idx] in cash:
            cash.remove(cities[idx])
            cash.append(cities[idx])
            res+=1
        else:
            cash.append(cities[idx])
            cash.pop(0)
            res+=5
    return res

casheSize = 
ar = ["a","a","b","c","a"]
#, "Seoul", "NewYork", "LA"]
print(solution(casheSize,ar))