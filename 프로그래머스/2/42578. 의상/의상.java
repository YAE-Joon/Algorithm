import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> choice = new HashMap<>();
        
        for(int i=0; i<clothes.length;i++){
            if(choice.get(clothes[i][1])==null){
                choice.put(clothes[i][1],1);
            }else{
                choice.put(clothes[i][1],choice.get(clothes[i][1])+1);
            }
            
        }
        
        for(Integer key : choice.values()){
            answer = answer* (key+1);
         }
        answer --;
        return answer;
    }
}