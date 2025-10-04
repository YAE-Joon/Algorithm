def solution(n, t, m, p):
    answer = ''
    
    length = p + t*m
    templist=[]
    i = -1
    while len(templist)<length:
        i += 1
        tx = convert(i,n)
        for idx in range(len(tx)):
            templist.append(tx[idx])

    
    for num in range(t):
        
        answer+=templist[p-1+num*m]
                    
    return answer
    
    
def convert(num, base):
    temp = "0123456789ABCDEF"
    q, r = divmod(num, base)

    if q == 0:
        return temp[r]
    else:
        # q를 base로 변환
        # 즉, n진수의 다음 자리를 구함
        return convert(q, base) + temp[r]