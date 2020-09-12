def solution(new_id):
    answer = ''
    new_id = new_id.lower()
    for i in new_id:
        if i.isalpha() or i=='-' or i=='_' or i == '.' or i.isdigit():
            answer += i
    while answer.find("..") >= 0:
        answer = answer.replace("..",".")
    
    answer = filter(answer)

    
    if len(answer) >=16:
        answer = answer[:15]
        answer = filter(answer)

    if len(answer) <= 2:
        while len(answer) < 3:
            answer += answer[-1]

    return answer

def filter(s):
    while s != "" and s[0] == '.':
        s = s[1:]
    
    while s != "" and s[-1] == '.':
        s = s[:-1]
    
    if s == "":
        s = "a"
    return s

    


s ="1234"


# print(s[:3])
# print(s)
# print(s.find(".."))
# print(s.replace("..",'s'))
"123_.def"
s = ".-o"
print(solution(s),len(solution(s)))