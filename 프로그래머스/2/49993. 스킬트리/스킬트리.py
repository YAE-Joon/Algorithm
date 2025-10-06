def solution(skill, skill_trees):
    answer = 0
    
    for item in skill_trees:  
        skill_set = list(skill)
        
        check = True
        for i in item:
            
            if i in skill_set:
                if i != skill_set[0]:
                    check = False
                    break
                else : skill_set.pop(0)
        
        if check :
            answer+=1
        
    return answer