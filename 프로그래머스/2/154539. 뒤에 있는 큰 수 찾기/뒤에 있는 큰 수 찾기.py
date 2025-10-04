def solution(numbers):
    answer =[] 
    answer.extend([-1]*len(numbers))
    
    stack = []   
    for idx, item in enumerate(numbers):
        
        while stack and stack[-1][1]<item:
            (i,number)=stack.pop()
            answer[i] = item
            
        stack.append((idx,item))
                     
    return answer