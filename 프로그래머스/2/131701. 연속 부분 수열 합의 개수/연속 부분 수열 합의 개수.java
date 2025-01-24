import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        
        Set<Integer> sumList = new HashSet<>();
        
        
        for(int i=1; i<=elements.length;i++){
            
            for(int l =0; l< elements.length;l++){
                int count =0;
                int sum = 0; 
                int circleNum;
                while(count!=i){
                    circleNum = l+count;
                    if(circleNum>elements.length-1){
                        circleNum = circleNum - elements.length;
                        
                    }
                    
                    sum +=elements[circleNum];
                    count++;
                }
                                        
                    sumList.add(sum);
            }    
        
        }
        
        answer = sumList.size();
        
        
        return answer;
    }
}