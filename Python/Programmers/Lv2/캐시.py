def solution(casheSize,cities):
    size = len(cities)
    if casheSize == 0: return size*5

    cities = [c.lower() for c in cities]
    res = 0
    cashe = []
    for i in range(size):
        if cities[i] in cashe:
            res+=1
            cashe.remove(cities[i])
            cashe.append(cities[i])
        else:
            if len(cashe)<casheSize:
                res+=5
                cashe.append(cities[i])
            else:
                cashe.pop(0)
                cashe.append(cities[i])
                res+=5
    return res



casheSize = 1
ar = ["a","a","b","c","a"]
#, "Seoul", "NewYork", "LA"]
print(solution(casheSize,ar))