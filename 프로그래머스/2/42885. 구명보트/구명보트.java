import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        
        Deque<Integer> peopleList = new ArrayDeque<>();
        
        Arrays.sort(people);
        
        
        for(int i=0;i<people.length;i++){
        
            peopleList.offer(people[i]);
        }
        while(peopleList.size()>2){
            
            int lastNum = peopleList.pollLast();
            int firstNum = peopleList.pollFirst();
                
           if(lastNum+firstNum<=limit){
               
               answer++;
           }else{
               peopleList.offerFirst(firstNum);
               answer++;
           }
           
                
        }
        
        if(peopleList.size()==2){
            if(peopleList.poll()+peopleList.poll()<=limit){
                answer++;
            }else{
                answer += 2;
            }
        }else{
            answer++;
        }
        
    
        return answer;
    }
}