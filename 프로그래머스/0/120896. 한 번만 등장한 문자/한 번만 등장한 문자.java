import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String result = "";
        for(int i = 0; i<s.length();i++){
          for(int l = 0; l<s.length();l++){
            if(i!=l&&s.charAt(i)==s.charAt(l)){
              break; 
            }
            if(l==s.length()-1){
                result += Character.toString(s.charAt(i));   
            }  
          } 
        }
        char[] b = result.toCharArray();
        Arrays.sort(b);
        for(int i=0; i<b.length;i++){
            answer+=Character.toString(b[i]);
        }
        
        return answer;
    }
}