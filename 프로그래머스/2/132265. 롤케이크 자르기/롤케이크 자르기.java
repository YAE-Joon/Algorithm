import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer,Integer> toppingNum = new HashMap<>();
        Set<Integer> equalTopping = new HashSet<>();
        
        for(int i=0; i<topping.length;i++){
             int putTopping = topping[i];
            if(toppingNum.containsKey(putTopping)){
                
                toppingNum.put(putTopping,toppingNum.get(putTopping)+1);
                
            }else{
                
                toppingNum.put(putTopping,1);
            }
        }
        
        
        
        
        for(int i=0;i<topping.length;i++){
            int putTopping = topping[i];
            
            if(!equalTopping.contains(putTopping)){
                equalTopping.add(putTopping);
            }
            
            if(toppingNum.get(putTopping)==1){
                
                toppingNum.remove(putTopping);
                
        
                
            }else{
                toppingNum.put(putTopping,toppingNum.get(putTopping)-1);
                
        
            }
                    

            if(equalTopping.size()==toppingNum.size()){
                
                answer++;
            }else if(equalTopping.size()>toppingNum.size()){
                break;
            }
            
        }
        
        
        return answer;
    }
}