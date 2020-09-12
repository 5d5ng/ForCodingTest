import heapq,copy
def solution(n, s, a, b, fares):
    graph  = [[] for i in range(n+1) ]
    for u,v,w in fares:
        graph[u].append([v,w])
        graph[v].append([u,w])
    tmpg = copy.deepcopy(graph)
    
    load = dijkstra(n,s,tmpg)
    val = load[a]+load[b]
    val = min (dijkstra(n,a,tmpg)[b] + load[a], val)
    val = min (dijkstra(n,b,tmpg)[a] + load[b], val)
    
    return val

def dijkstra(n,k,g):
    inf = 10000000+1
    q = []
    route = []
    k_d = [inf for _ in range(n+1)]
    k_d[k] = 0
    heapq.heappush(q,[0,k])
    route.append(k)
    while q:
        mid = heapq.heappop(q)
        for end in g[mid[1]]:
            if k_d[end[0]] > mid[0] + end[1]:
                k_d[end[0]] = mid[0] + end[1]
                route.append(end)
                heapq.heappush(q,[k_d[end[0]] ,end[0] ])

    return k_d 







f = [[4, 1, 10], [3, 5, 24], [5, 6, 2], [3, 1, 41], [5, 1, 24], [4, 6, 50], [2, 4, 66], [2, 3, 22], [1, 6, 25]]
print(solution(6,4,6,2,f))

