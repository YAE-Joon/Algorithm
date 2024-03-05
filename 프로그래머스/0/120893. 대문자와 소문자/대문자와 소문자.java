class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length();i++){
            if(Character.isLowerCase(my_string.charAt(i))){
               answer += Character.toString(Character.toUpperCase(my_string.charAt(i)));
            }else{
                answer+=Character.toString(Character.toLowerCase(my_string.charAt(i)));    
            }
        }
        return answer;
    }
}