import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> entry = new HashMap<>();
        
        for(String name : participant){
           
            if(entry.get(name)!=null){
            
            entry.put(name,entry.get(name)+1);
        }else{
                entry.put(name,1);
            }
        }
        
        for(String name : completion){
            entry.put(name,entry.get(name)-1);
        }
        for(String last : entry.keySet() ){
            if(entry.get(last)!=0){
                answer = last;
                break;
            }
        }
            return answer;
    }
}