def solution(n,t,m,p):
    answer = replace(n,m*t)
    res = ""
    for i in range(p-1,len(answer),m):
        res+=answer[i]
        if len(res)==t:return res

def replace(n,size): # size까지 
    num = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F']
    lst = ['0','1']
    start = 2
    while(len(lst)<size):
        target = start
        temp = []
        while(target>0):
            tnum = target % n
            target = int(target/n)
            temp.append(num[tnum])
        temp = temp[::-1]
        for i in temp:
            lst.append(i)
        
        start+=1

    return lst

n = 16
size = 16
print(solution(2,4,2,1))

# num = 10
# l = []
# while(num>0):
#     temp = num%2
#     num = int(num/2)
#     l.append(temp)
# print(l)
    

        
        
