class Solution {
    public long solution(int n) {
        long answer = 0;
        
        long count = 1;
        long sum = 0;
        long num = 0;
        long nextNum =1;
        
        
        for(int i=0; i<n;i++){
            
            sum = num+nextNum;
            num =nextNum%1234567;
            nextNum = sum%1234567;
        
        }
            answer = sum%1234567;
            
        return answer;
    }
}