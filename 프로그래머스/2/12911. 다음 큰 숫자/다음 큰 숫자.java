class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int one = oneNum(n);
        int next = n+1;
        
        while(true){
            int nextNum = oneNum(next);
            if(nextNum==one){
                answer = next;
                break;
            }else{
                next++;
            }
        }
        return answer;
        }
    
    
    public int oneNum(int num){
        
         int oneNum = 0;
             
        while(true){
            if(num%2!=0&&num!=1){
                num=num/2;
                oneNum++;
            }else if(num%2==0&&num!=1){
                num=num/2;
            }else if(num==1){
                num=num/2;
                oneNum++;
                break;
            }
        
        }
        return oneNum;
        
        
    }
}