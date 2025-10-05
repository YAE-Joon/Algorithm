import heapq

def solution(scoville, K):
    heapq.heapify(scoville)  # O(n)
    answer = 0
    
    while scoville[0] < K:
        if len(scoville) < 2:
            return -1
        
        first = heapq.heappop(scoville)   # 가장 작은 값
        second = heapq.heappop(scoville)  # 두 번째로 작은 값
        
        new_scoville = first + (second * 2)
        heapq.heappush(scoville, new_scoville)
        
        answer += 1
    
    return answer