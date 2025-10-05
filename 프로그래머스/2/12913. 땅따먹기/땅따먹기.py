def solution(land):
    maxi = [0,0,0,0]
    for i in range(len(land)):
        t1=land[i][0] + max(maxi[1],maxi[2],maxi[3])
        t2=land[i][1] + max(maxi[0],maxi[2],maxi[3])        
        t3=land[i][2] + max(maxi[1],maxi[0],maxi[3])
        t4=land[i][3] + max(maxi[1],maxi[2],maxi[0])
        maxi[0]=t1
        maxi[1]=t2
        maxi[2]=t3
        maxi[3]=t4
    
    answer = max(maxi)
    
    return answer