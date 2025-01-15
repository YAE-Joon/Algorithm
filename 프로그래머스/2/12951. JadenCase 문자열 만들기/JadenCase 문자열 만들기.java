import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String b = s.toLowerCase();
        
        for(int i=0; i<b.length();i++){
            
            if(i!=0&&b.charAt(i-1)==' '){
                
                answer += Character.toUpperCase(b.charAt(i));
            }else if(i==0){
            answer += Character.toUpperCase(b.charAt(i));
                
            }else{
                
                answer+= b.charAt(i);
            }
            
                        
        }
        
        return answer;
    }
}