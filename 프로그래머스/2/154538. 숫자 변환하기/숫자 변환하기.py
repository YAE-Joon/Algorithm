from collections import deque
def solution(x, y, n):
    answer=-1
    stack = deque()
    this = [y,0]
    stack.append(this)
    while stack:
        now = stack.popleft()
        if now[0]==x:
            if answer>0 and answer>now[1]:
                answer = now[1]
            elif answer<0:
                answer = now[1]
        if now[0]>x:
            if answer<0 or answer>now[1]:
                if now[0]%3==0:
                    stack.append([now[0]/3,now[1]+1])
                if now[0]%2==0:
                    stack.append([now[0]/2,now[1]+1])
                stack.append([now[0]-n,now[1]+1])

    return answer