def solution(id_pw, db):
    answer = ''
    
    for item in db:
        if id_pw[0] == item[0]:
            if id_pw[1]==item[1]:
                answer = 'login'
            else: answer = 'wrong pw'
    
    if answer == '':
        answer = 'fail'
    return answer