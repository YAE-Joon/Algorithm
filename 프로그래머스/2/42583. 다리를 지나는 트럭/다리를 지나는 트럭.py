from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    time = 0
    bridge = deque()
    bridge.extend([0]*bridge_length)
    total_weight = 0
    while truck_weights:
        time += 1
        out = bridge.popleft()
        total_weight -= out
        if(total_weight+truck_weights[0]<=weight):
            truck = truck_weights.pop(0)
            bridge.append(truck)
            total_weight += truck   
        else: bridge.append(0)
    
    time +=bridge_length
    answer = time
        
        
    return answer