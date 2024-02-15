class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for(int i = 1; i<=50;i++){
            
            if(slice*i/n==1){
                answer = i;
                break;
            }else if((slice/n)>1){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}