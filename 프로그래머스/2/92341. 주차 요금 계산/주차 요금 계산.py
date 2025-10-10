from datetime import datetime,timedelta
import math
def solution(fees, records):
    answer = []
    
    fee_list = {}
    temp_an={}
    for car in records:
        car_list= car.split(' ')
        if fee_list.get(car_list[1]) is not None:
            time = datetime.strptime(car_list[0],"%H:%M")-datetime.strptime(fee_list.pop(car_list[1]),"%H:%M")
            if temp_an.get(car_list[1]) is None:
                temp_an[car_list[1]] =time
            else: temp_an[car_list[1]] += time
        else :
            fee_list[car_list[1]]=car_list[0]
    for key,value in fee_list.items():
        time1 = datetime.strptime('23:59',"%H:%M")-datetime.strptime(value,"%H:%M")
        if temp_an.get(key) is None:
            temp_an[key] =time1
        else: temp_an[key] += time1
    keys_list = list(temp_an.keys())
    keys_list.sort()
    for car_num in keys_list:
        t = int(temp_an[car_num].total_seconds()/60)
        ans=0
        if t > fees[0]:
            ans =fees[1]+math.ceil((t-fees[0])/fees[2])*fees[3]
        else: ans = fees[1]
        answer.append(ans)
    
    
    return answer