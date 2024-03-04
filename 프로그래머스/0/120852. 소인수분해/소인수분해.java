import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
   
       List<Integer> a = new ArrayList<>();
        for(int i = 2; i<=n;i++){
           if(n%i==0){
               a.add(i);
               while(n%i==0){
                  n= n/i;
               }
           }
       }
        int[] answer = a.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}