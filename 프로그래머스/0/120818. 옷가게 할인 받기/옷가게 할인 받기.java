class Solution {
    public int solution(int price) {
        double result = 0;
        int answer = 0;
        if(price>=500000){
            result = 0.8*price;
        }else if(price>=300000){
            result = 0.9*price;
        
        }else if(price>=100000){
            result = 0.95*price;
        }else{
            result = price;
        }
        
        answer = (int)result;
        return answer;
    }
}