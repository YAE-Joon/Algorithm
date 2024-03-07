import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String result ="0";
        char[] a =my_string.toCharArray();
        if(Character.isLowerCase(a[0])||Character.isUpperCase(a[0])){
            result += ""; 
        }else{
            result += Character.toString(a[0]);
        }
        
        for(int i =1; i<a.length;i++){
            if(Character.isLowerCase(a[i])||Character.isUpperCase(a[i])){
               if(Character.isLowerCase(a[i-1])||Character.isUpperCase(a[i-1]))
               { result +="";}
                else{ result +=" ";}
            }else{
                result += Character.toString(a[i]);
            }
        }
            String[] answering = result.split(" ");
            for(int i=0; i<answering.length;i++){
                answer += Integer.parseInt(answering[i]);
            }
        return answer;
    }
}