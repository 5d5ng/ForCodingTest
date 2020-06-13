def solution(scoville, K):
    import heapq
    heapq.heapify(scoville)
    ans = 0
    while len(scoville)>1:
        ans+=1
        temp = heapq.heappop(scoville)+2*heapq.heappop(scoville)
        heapq.heappush(scoville,temp)
        if(scoville[0]>=K):
            return ans
    return -1



l = [1, 2, 3, 9, 10, 12]
print(solution(l,7))
