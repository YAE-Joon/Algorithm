import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String result = "";
        for(int i =0; i<my_string.length(); i++){
            if(my_string.charAt(i)=='0'||
               my_string.charAt(i)=='1'||
               my_string.charAt(i)=='2'||
               my_string.charAt(i)=='3'||
               my_string.charAt(i)=='4'||
               my_string.charAt(i)=='5'||
               my_string.charAt(i)=='6'||
               my_string.charAt(i)=='7'||
               my_string.charAt(i)=='8'||
               my_string.charAt(i)=='9'){
            result += Character.toString(my_string.charAt(i));     
            }
        }
        int[] answer = new int[result.length()];
        for(int i = 0; i<result.length();i++){
            answer[i] = (int)result.charAt(i)-48;
        }
        Arrays.sort(answer);
        return answer;
    }
}