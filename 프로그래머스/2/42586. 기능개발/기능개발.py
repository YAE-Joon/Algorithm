def solution(progresses, speeds):
    answer = []
    day = 0
    while progresses:
        day += 1
        l = 0
        while progresses and progresses[0]+speeds[0]*day>=100:
            progresses.pop(0)
            speeds.pop(0)
            l += 1
        if(l!=0):
            answer.append(l)
            
    return answer