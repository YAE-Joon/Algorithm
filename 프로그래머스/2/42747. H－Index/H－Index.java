class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int count = 0;
        int n =1;
        for(int l=0; l<citations.length;l++){
            for(int i=0; i<citations.length;i++){
                if(citations[i]>=n){
                 count++;
                }       
            }
            if(count>=n){
                answer = n;
                }   
            n++;
            count=0;
        }
        return answer;
    }
}