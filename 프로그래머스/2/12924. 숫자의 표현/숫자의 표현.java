class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i=0;i<n/2;i++){
            int sum = 0;
            int next = i+1;
            while(sum<n){
                sum += next;
                ++next; 
            }    
            if(sum==n){
                answer++;
            }
        }
        
        return answer;
    }
}