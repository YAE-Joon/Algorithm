def solution(a, b):
    answer = 0
    
    while a%2==0:
        a = a/2
    while a%5==0:
        a = a/5
        print(a)
    
    while b%2==0:
        b = b/2
    while b%5==0:
        b = b/5
    
    print("a :",a,"b :",b)

    if a%b ==0 :
        answer = 1
    else : answer =2
    
    return answer