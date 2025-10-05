def solution(order):
    answer = 0
    stack = []
    burden = []
    for i in range(len(order)):
        num = len(order)
        burden.append(num-i)
    item = 0 
    for num in order:
        while burden and num >= burden[-1]:
            item = burden.pop()
            if item ==num:
                answer+=1
                break
            elif item < num:
                stack.append(item)
        if stack and stack[-1]==num:
            stack.pop()
            answer+=1
        elif burden is None or num<item:
            break
    
    return answer