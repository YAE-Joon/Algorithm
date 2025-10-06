from collections import deque 

def solution(skill, skill_trees):
    answer = 0
    n = list(skill)
    
    for item in skill_trees:
        for idx,i in enumerate(n):
            item = item.replace(i,' '+str(idx)+' ')
        
        stack=[]
        item = item.split(' ')
        ot = True
        ans = -1
        for k in item:
            try:
                l = int(k)
                if ans+1==l:
                    ans = l
                else: 
                    ot=False                
                    break
            except: continue
            
        if ot :
            answer+=1
        
    return answer