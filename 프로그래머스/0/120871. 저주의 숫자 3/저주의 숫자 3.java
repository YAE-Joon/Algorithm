class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count=0;
       for(int i=0; i<n;i++){
           count++;
           String m = Integer.toString(count);
           while(m.contains("3")||count%3==0){
               count++;
               m= Integer.toString(count);
           }
       }
        answer =count;
        return answer;
    }
}