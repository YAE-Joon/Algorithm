import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i=0; i<answer.length;i++){
            answer[i]="";
        }
        
        for(int i =0; i<strings.length;i++){
            char temp = strings[i].charAt(n);
            strings[i] = temp + strings[i];
        }
        
        Arrays.sort(strings);
        
         for(int i =0; i<strings.length;i++){
             for(int m =1; m<strings[i].length();m++){
            answer[i] += strings[i].charAt(m);
            }
        }   
        return answer;
    }
}