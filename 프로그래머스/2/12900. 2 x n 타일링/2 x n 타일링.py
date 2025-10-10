def solution(n):
    
    k = 1
    k2 = 2
    k3 = 3
    for i in range(1,n+1):
        k3 = k%1000000007+k2%1000000007
        k = k2%1000000007
        k2 = k3%1000000007
    print(k2-k)
    answer = (k2-k)%1000000007
    return answer