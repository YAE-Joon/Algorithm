import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Deque<Integer> list = new ArrayDeque<>();
        for(int i=0; i<priorities.length;i++){
            list.offer(priorities[i]);
        }
        
        int loop = list.size();
        int rank = 9;
        while(list.peek()!=null){
            int temp = list.poll();
            loop--;
            location--;
            
            if(location <0){
             if(temp!=rank){
                    list.offer(temp);
                    location = list.size()-1;
                }else{
                    answer++;
                    break;
                }
            }else{ 
                if(temp!=rank){
                    list.offer(temp);
                    }else{
                    answer++;
                    loop = list.size();
                    }
            }
            
            if(loop==0){
                rank--;
                loop=list.size();
            }
            
        }
        
        
        return answer;
    }
}