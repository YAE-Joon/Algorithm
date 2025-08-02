def solution(num, total):
    answer = []
    
    range1 = total
    
    for i in range(-num,range1+1):
        n= 0
        for l in range(num):
            n += i+l
        if n==total:
            answer = [i+m for m in range(num) ]
        
        
    return answer