def solution(number):
    answer = 0
    t=0
    for i in range(len(number)):
        t+=int(number[i])
    answer = t%9
    return answer