def solution(arr):
    answer = []
    
    answer.append(arr[0])
    for item in arr:
        if(answer[-1]!=item):
            answer.append(item)
        
    
    return answer