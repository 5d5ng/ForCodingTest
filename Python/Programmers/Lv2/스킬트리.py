def solution(skill, skill_trees):
    answer = 0
    for s in skill_trees:
        temp = []
        flag = True
        for i in skill:
            temp.append(s.find(i))
        for i in range(len(temp)-1):
            if (temp[i] == -1 and temp [i+1] > -1 ) or temp[i]>temp[i+1]>=0:
                flag = False
                break
        if (flag):
            print(s)
            answer+=1
            
    return answer

skill = 'CBD'
skill_t = ["BACDE", "CBADF", "AECB", "BDA"]

n = solution(skill,skill_t)
print(n)

def solution2 (skill,skill_trees):
    answer = 0
    for skills in skill_trees:
        skill_list = list(skill)
        for s in skills:
            if s in skill:
                if s != skill_list.pop(0):
                    break
        else:
            answer+=1

    return answer

# for - else 문은 for문이  끝까지 간다면 else문을 실행시킨다.