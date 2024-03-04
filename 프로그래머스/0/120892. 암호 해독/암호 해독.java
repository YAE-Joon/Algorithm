class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=1;i<=cipher.length()/code;i++){
          answer += Character.toString(cipher.charAt(i*code-1));
        }
        return answer;
    }
}