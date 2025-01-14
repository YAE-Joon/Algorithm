class Solution {
    public int solution(int n) {
        int answer = 0;
        
        long first = 0;
        long next = 1;
        long sum = 0;
        
        for(int i = 1; i<n;i++){
            
            sum = first + next;
            first = next%1234567;
            next = sum%1234567;
            
        }
        System.out.println(sum);        
        answer = (int)sum%1234567;
        
        return answer;
    }
}