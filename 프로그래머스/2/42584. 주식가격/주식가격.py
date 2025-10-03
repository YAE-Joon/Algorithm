def solution(prices):
    n = len(prices)
    answer = [0] * n
    stack = []  # (index, price) 저장
    
    for i in range(n):
        # 현재 가격이 스택의 가격보다 작으면
        # 스택에 있는 가격들이 떨어진 것
        while stack and stack[-1][1] > prices[i]:
            idx, price = stack.pop()
            answer[idx] = i - idx
        
        stack.append((i, prices[i]))
    
    # 스택에 남은 것들은 끝까지 떨어지지 않은 것
    while stack:
        idx, price = stack.pop()
        answer[idx] = n - 1 - idx
    
    return answer