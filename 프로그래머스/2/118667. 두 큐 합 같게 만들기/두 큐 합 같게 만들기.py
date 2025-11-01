from collections import deque
def solution(queue1, queue2):
    answer = 0
    result = len(queue1)+len(queue2)
    que1 = deque(queue1)
    que2 = deque(queue2)
    qs1 = sum(queue1)
    qs2 = sum(queue2)
    
    if (qs1+qs2)%2 !=0:
        return -1
    predict = (qs1+qs2)/2
    while qs1!=predict:
        if qs1>qs2:
            s= change(que1,que2)
            qs1=qs1-s
            qs2=qs2+s
        elif qs1<qs2:
            s= change(que2,que1)
            qs1 = qs1+s
            qs2 = qs2-s
        answer+=1
        if answer >result*3:
            answer = -1
            break
    return answer

def change(que1,que2):
    s = que1.popleft()
    que2.append(s)
    return s