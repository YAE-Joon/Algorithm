def solution(array, commands):
    answer = []
    for item in commands:    
        temp = []
        for i in range(item[0]-1,item[1]):
            temp.append(array[i])
            print(temp)
            
        temp.sort()
        
        answer.append(temp[item[2]-1])

    
    return answer