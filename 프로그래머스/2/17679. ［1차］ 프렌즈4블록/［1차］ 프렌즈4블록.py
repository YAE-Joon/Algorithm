def solution(m, n, board):
    answer = 0
    st=''
    for i in board:
        st = st+i
    
    gostop = True
    while gostop:
        gostop,st = anypang(m,n,st)
    
    for t in range(len(st)):
        if st[t]==' ':
            answer+=1
    return answer

def anypang(m,n,st):
    t= []
    for r in range(len(st)-1-n):
        if st[r]==st[r+1] and st[r]==st[r+n] and st[r]==st[r+n+1] and (r+1)%n!=0 and st[r] !=' ':
            t.append(r)
    st_list = list(st)
    
    if t:
        for i in t:
            st_list[i] = ' '
            st_list[i+1]= ' '
            st_list[i+n+1]= ' '
            st_list[i+n]= ' '
        
        o=-1
        while o<len(st_list)-1:
            o+=1
            if o>=n and st_list[o]==' ' and st_list[o-n]!=' ':
                st_list[o]=st_list[o-n]
                st_list[o-n]=' '
                o=o-n-1
        result = ''.join(st_list)
        return (True,result)
    else:
        result = ''.join(st_list)
        return (False,result)