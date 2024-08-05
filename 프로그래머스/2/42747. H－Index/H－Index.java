import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);   
        
        for(int i =0; i<citations.length;i++){
            
            if(citations.length-i-1>=citations[i]){
                answer = citations.length-i-1;
                System.out.println(answer);
            }
        }
        if(citations.length<citations[0]){
            answer = citations.length;
        }
            
        return answer;
    }
}