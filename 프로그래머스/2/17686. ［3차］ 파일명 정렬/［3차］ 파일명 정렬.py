import re
def solution(files):
    answer = []
    before_sort = []
    sort=[]
    for idx,item in enumerate(files):
        number = re.search(r'\d{1,5}',item)
        if number:
            t = number.group()
        temp = item.split(t,1)
        temp.append(int(t))
        temp.append(t)
        temp.append(idx)
        before_sort.append(temp)
    sort = sorted(before_sort,key = lambda x: (x[0].lower(),x[2],x[4]))
    for i in sort:
        ans = i[0]+i[3]+i[1]
        answer.append(ans)
    return answer