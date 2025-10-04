import math
def solution(n, k):
    answer = 0
    jin_num = jin(n,k)
    candidate=jin_num.split('0')
    for item in candidate:
        if item and int(item) >1:
            target = 2
            take_num = int(item)
            is_value = True
            while target <=math.sqrt(take_num):
                if take_num%target ==0:
                    is_value = False
                    break
                target +=1
            if is_value:
                answer +=1
    return answer

def jin(num,k):
    
    q,r = divmod(num,k)
    
    if q ==0:
        return str(r)
    else: 
        return jin(q,k)+str(r)
    