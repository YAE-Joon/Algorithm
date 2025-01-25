import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        //discount 는 stack으로 ? 아니면 그냥 배열로? LIFO 구조이기 때문에 stack을 선택 
        
        //want number 는 Map으로
        
        //value값이 모두 0이 되는 순간 result+1. value값을 판단하는 Method를 하나 만들것.
        
        //Map 코드
        
        Map<String,Integer> wantNum =new HashMap<>();
        
        for(int i=0; i<want.length;i++){
            
            wantNum.put(want[i],number[i]);
        }
        
        //stack 코드
        Deque<String> dCList = new ArrayDeque<>();
        for(int i=0; i<10;i++){
            
            String dC = discount[i];
            dCList.offerLast(dC);
             if(wantNum.containsKey(dC)){
                
                wantNum.put(dC,wantNum.get(dC)-1);
            }
            
        }
        
            if(checkNum(wantNum)){
                answer++;
            }
        
        
        
        for(int i=10;i<discount.length;i++){
            
            String nextDC = discount[i];
            String beforeDC = dCList.pollFirst();
            dCList.offerLast(nextDC);
            
            if(wantNum.containsKey(beforeDC)){
                wantNum.put(beforeDC,wantNum.get(beforeDC)+1);
            }
            
            if(wantNum.containsKey(nextDC)){
                 wantNum.put(nextDC,wantNum.get(nextDC)-1);
                }
            
            if(checkNum(wantNum)){
                answer++;
            }
        }
        
        
        
        return answer;
    }
    
    
    public boolean checkNum(Map<String,Integer> list){
        
        Collection<Integer> numList = list.values();
        for(int n : numList){
            
            if(n!=0){
                return false;
            }
        }
        
        return true;
    
    }
}