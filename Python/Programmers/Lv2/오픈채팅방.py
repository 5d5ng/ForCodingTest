def solution (record):
    member = {}
    ans =[]
    
    for order in record:
        lst = order.split(" ")
        if lst[0] == "Enter":
            member[lst[1]] = lst[2]
        elif lst[0] =="Change":
            member[lst[1]] = lst[2]

    for order in record:
        lst = order.split(" ")
        if lst[0] == "Enter":
            print("{}님이 들어왔습니다.".format(member[lst[1]]))
        elif lst[0] =="Leave":
            print("{}님이 나갔습니다..".format(member[lst[1]]))

    
            

    return ans   
        
record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
solution(record)


