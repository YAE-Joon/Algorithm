def solution(common):
    answer = 0
    d = common[1] - common[0]
    r=0
    if common[0]!=0:
        r = common[1]//common[0]
    
    if common[2]== common[1]+d:
        answer = common[len(common)-1]+d
    else: answer = common[len(common)-1]*r
    return answer