def solution(chicken):
    answer = 0
    temp = chicken
    while temp/10 >=1:
        answer +=temp//10
        temp = temp//10 +temp%10
        print("chicken =", temp )
    print(chicken//10)
    return answer