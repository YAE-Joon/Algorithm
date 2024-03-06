import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> a = new ArrayList<>();
        for(int i = 0; i<s.length();i++){
          for(int l = 0; l<s.length();l++){
            if(i!=l&&s.charAt(i)==s.charAt(l)){
              break; 
            }
            if(l==s.length()-1){
                a.add(Character.toString(s.charAt(i)));   
            }  
          } 
        }
        
        String[] b = a.toArray(new String[0]);
        Arrays.sort(b);
        for(int i=0; i<b.length;i++){
            answer+=b[i];
        }
        
        return answer;
    }
}