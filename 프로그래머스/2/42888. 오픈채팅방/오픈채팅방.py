def solution(record):
    answer = []
    name_list={}
    stack = []
    while record:
        l = record.pop()
        i = l.split(" ")
        if i[0]=='Change' and name_list.get(i[1]) is None:
            name_list[i[1]] = i[2]
        elif i[0] =='Enter' and name_list.get(i[1]) is None: 
            name_list[i[1]] = i[2]
            stack.append((i[0],i[1]))
        else:
            stack.append((i[0],i[1]))
    while stack:
        inout, name = stack.pop()
        nick = name_list[name]
        if inout == 'Enter':
            answer.append(nick+'님이 들어왔습니다.')
        elif inout == 'Leave':
            answer.append(nick+'님이 나갔습니다.')
        
        
    
    return answer