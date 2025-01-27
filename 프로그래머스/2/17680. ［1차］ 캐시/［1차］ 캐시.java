import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        for(int i=0; i<cities.length;i++){
            
            cities[i] = cities[i].toLowerCase();
            
        }
        
        
        Deque<String> cache = new ArrayDeque<>();
        
            
        for(int i = 0 ;i<cities.length;i++){
                
            if(cache.contains(cities[i])){
                
                cache.remove(cities[i]);
                cache.offerLast(cities[i]);
            
                answer++;
            }else{
                
                
                if(cacheSize<=cache.size()&&cacheSize!=0){
                    
                    cache.pollFirst();
                }
                
                cache.offerLast(cities[i]);
                
                answer +=5;
            }
            
            if(cacheSize==0){
                cache.remove();
            }
        }
        
        return answer;
    }
}