import datetime
def solution(lines):
    combined_logs = []
    for log in lines:
        logs = log.split(' ')
        timestamp = datetime.datetime.strptime(logs[0]+' '+logs[1],"%Y-%m-%d %H:%M:%S.%f").timestamp()
        # print(timestamp)
        combined_logs.append((timestamp,-1))
        combined_logs.append((timestamp- float(logs[2][:-1]) + 0.001,1))
    # print(combined_logs)

    accumulated = 0
    max_requests = 1
    combined_logs.sort(key=lambda x: x[0])

    for i,elem1 in enumerate(combined_logs):
        current = accumulated
        for elem2 in combined_logs[i:]:
            if elem2[0] - elem1[0] > 0.999:
                break
            if elem2[1] > 0:
                current +=elem2[1]
        max_requests = max(max_requests,current)
        accumulated+=elem1[1]
    return max_requests
    
t =  ["2016-09-15 00:00:00.000 2.3s", "2016-09-15 23:59:59.999 0.1s"]
print(solution(t))
