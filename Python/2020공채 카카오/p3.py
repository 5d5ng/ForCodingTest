def solution(info, query):
    answer = []
    apply = []
    qlist = []
    for m in info:
        apply.append(m.split(" "))

    for q in query:
        q = q.replace("and","")
        q = q.replace("  "," ")
        qlist.append(q.split(" "))

    for q in qlist:
        cnt = 0
        for mem in apply:
            for i in range(5)

        answer.append(cnt)
    print(qlist)
    return answer


# def solution(info, query):
#     answer = []
#     apply = []
#     qlist = []
#     for m in info:
#         apply.append(m.split(" "))

#     for q in query:
#         q = q.replace("and","")
#         q = q.replace("  "," ")
#         qlist.append(q.split(" "))

#     for q in qlist:
#         cnt = 0
#         for mem in apply:
#             chk = True
#             for i in range(4):
#                 if not(q[i] == '-' or q[i] == mem[i]):
#                     chk = False
#                     break
#             if chk and (q[4] == '-' or   int(mem[4])>= int(q[4])):
#                 cnt+=1       
#         answer.append(cnt)
#     print(qlist)
#     return answer




info = ["java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"]
query = ["java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"]

print(solution(info,query))