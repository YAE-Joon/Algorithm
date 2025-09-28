def solution(dirs):
    answer = 0
    
    empty_set = set()
    
    cat = [0,0]
    
    for item in dirs:
        jp = []
        jp_m = []
        if(item=='U'):
            if(cat[1]<=4):
                tuple1 = tuple([cat[0],cat[1],cat[0],cat[1]+1])
                cat[1] +=1
                tuple2 = tuple([cat[0],cat[1],cat[0],cat[1]-1])
                empty_set.add(tuple1)
                empty_set.add(tuple2)
        
        if(item=='D'):
            if(cat[1]>=-4):
                tuple1 = tuple([cat[0],cat[1],cat[0],cat[1]-1])
                cat[1] -=1
                tuple2 = tuple([cat[0],cat[1],cat[0],cat[1]+1])
                empty_set.add(tuple1)
                empty_set.add(tuple2)
        
        if(item=='R'):
            if(cat[0]<=4):
                tuple1 = tuple([cat[0]+1,cat[1],cat[0],cat[1]])
                cat[0] +=1
                tuple2 = tuple([cat[0]-1,cat[1],cat[0],cat[1]])
                empty_set.add(tuple1)
                empty_set.add(tuple2)
        
        if(item=='L'):
            if(cat[0]>=-4):
                tuple1 = tuple([cat[0]-1,cat[1],cat[0],cat[1]])
                cat[0] -=1
                tuple2 = tuple([cat[0]+1,cat[1],cat[0],cat[1]])
                empty_set.add(tuple1)
                empty_set.add(tuple2)
    answer= len(empty_set)/2
    return answer