
def solution(str1,str2):
    flag = 65536
    lst1 = []; lst2 = [];
    for i in range(len(str1)-1):
        t = str1[i:i+2].lower()
        if t.isalpha():lst1.append(t)
    for i in range(len(str2)-1):
        t = str2[i:i+2].lower()
        if t.isalpha():lst2.append(t)
    print(lst1,lst2)
    vis1 = [0 for i in range(len(lst1))]
    vis2 = [0 for i in range(len(lst2))]
    common = 0
    for i in range(len(lst1)):
        for j in range(len(lst2)):
            if vis1[i] == 0 and vis2[j] == 0 and lst1[i] == lst2[j]:
                common+=1
                vis1[i] = 1
                vis2[j] = 1
    sumset = len(lst1)+len(lst2) - common
    if sumset == 0 : return flag
    return int(flag*(common/sumset))


    
        



print(solution("E=M*C^2","e=m*c^2"))


