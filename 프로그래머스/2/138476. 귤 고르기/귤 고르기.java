import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> sizeNum =new HashMap<>();
        
        Arrays.sort(tangerine);
        
        for(int i=0; i<tangerine.length;i++){
            
            if(sizeNum.containsKey(tangerine[i])){
               sizeNum.put(tangerine[i],sizeNum.get(tangerine[i])+1); 
                
            }else{
            sizeNum.put(tangerine[i],1);
            }
            
        }
        List<Integer> kValues = new ArrayList<>(sizeNum.values()); 
            kValues.sort(Collections.reverseOrder());
        
        for(int i=0; i<kValues.size();i++){
            
            
            k=k-kValues.get(i);
            answer++;
            if(k<=0){
                break;
            }
            
        }
        
        return answer;
    }
}