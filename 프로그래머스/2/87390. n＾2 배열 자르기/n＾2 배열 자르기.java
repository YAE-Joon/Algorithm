import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        
        int length = (int)(right-left+1);
        
        int[] answer = new int[length];
        
        int lth =0;
        //이를 배열로 변환
        int k ;
        int m ;
        long a = left +1;        
        
        if((int)(a%n)!=0){
            k = (int)(a/n);
            m = (int)(a%n)-1;
        }else{
            k = (int)(a/n)-1;
            m = n-1;
        }
        
        
       outer: for(int i=k; i<n;i++){
            for(int l=0; l<n; l++){
                
                if(lth ==0){
                    l = m;
                }
                   
                    if(i<l){
                         answer[lth] = l+1;
                     }else{
                           answer[lth] = i+1;
                         }
                    lth++;
                
                if(lth==length){
                    break outer; 
                }
            }
        }
        
        
        //배열의 결과값을 반환하는 answer.
        
        
        return answer;
    }
}