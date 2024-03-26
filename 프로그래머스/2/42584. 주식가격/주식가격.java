class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length;i++){
            for(int l=i+1;l<prices.length;l++){
            if(prices[i]>prices[l]||l==prices.length-1){
                answer[i]=l-i;
                break;
            }
        }
            
        }
        
        
        return answer;
    }
}