def solution(msg):
    answer = []
    dic = list('ABCDEFGHIJKLMNOPQRSTUVWXYZ')
    while len(msg) !=0:
        for i in range(len(dic)):
            idx= len(dic)-i-1
            if msg.startswith(dic[idx]):
                prefix = dic[idx]
                answer.append(idx+1)
                msg = msg[len(prefix):]
                if len(msg) !=0:
                    plus_word = prefix + msg[0]
                    dic.append(plus_word)
                    break
    return answer